/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.infinispan.remote.cluster;

import static org.apache.camel.component.infinispan.remote.cluster.InfinispanRemoteClusteredTestSupport.createCache;
import static org.apache.camel.component.infinispan.remote.cluster.InfinispanRemoteClusteredTestSupport.createConfiguration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.cluster.CamelClusterMember;
import org.apache.camel.cluster.CamelClusterView;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.test.infra.infinispan.services.InfinispanService;
import org.apache.camel.test.infra.infinispan.services.InfinispanServiceFactory;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import org.infinispan.client.hotrod.RemoteCacheManager;
import org.infinispan.client.hotrod.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.DirtiesContext;

import java.util.concurrent.TimeUnit;

@DirtiesContext
@CamelSpringBootTest
@SpringBootTest(
		classes = {
				CamelAutoConfiguration.class,
				InfinispanRemoteClusteredViewIT.class
		}
)
public class InfinispanRemoteClusteredViewIT {
	@RegisterExtension
	public static InfinispanService service = InfinispanServiceFactory.createService();

	@Autowired
	private CamelContext context;

	@Test
	public void getLeaderTest() throws Exception {
		final String viewName = "myView";

		Configuration configuration = createConfiguration(service);

		try (RemoteCacheManager cacheContainer = new RemoteCacheManager(configuration)) {
			createCache(cacheContainer, viewName);

			InfinispanRemoteClusterService clusterService = new InfinispanRemoteClusterService();
			clusterService.setCacheContainer(cacheContainer);
			clusterService.setId("node");

            context.addService(clusterService);

			context.addRoutes(new RouteBuilder() {
				@Override
				public void configure() {
					fromF("master:%s:timer:infinispan?repeatCount=1", viewName)
							.routeId("route1")
							.stop();
				}
			});

			CamelClusterView view = clusterService.getView(viewName);

			await().atMost(5, TimeUnit.SECONDS).untilAsserted(() -> {
				assertThat(view.getLeader())
						.get()
						.satisfies(CamelClusterMember::isLeader)
						.satisfies(CamelClusterMember::isLocal);
			});
		}
	}
}
