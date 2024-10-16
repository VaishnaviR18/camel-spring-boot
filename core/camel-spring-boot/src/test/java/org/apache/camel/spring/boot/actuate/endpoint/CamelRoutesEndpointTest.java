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
package org.apache.camel.spring.boot.actuate.endpoint;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRoutesEndpoint.ReadAction;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRoutesEndpoint.RouteDetailsEndpointInfo;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRoutesEndpoint.RouteEndpointInfo;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRoutesEndpoint.TimeInfo;
import org.apache.camel.spring.boot.actuate.endpoint.CamelRoutesEndpoint.WriteAction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;

/*
 * Test for the {@link CamelRoutesEndpoint} actuator endpoint.
 */
@DirtiesContext
@CamelSpringBootTest
@EnableAutoConfiguration
@SpringBootTest(classes = {CamelAutoConfiguration.class, CamelRoutesEndpointAutoConfiguration.class, ActuatorTestRoute.class},
                           properties = {"management.endpoints.web.exposure.include=*"})

public class CamelRoutesEndpointTest {

    @Autowired
    CamelRoutesEndpoint endpoint;

    @Autowired
    CamelContext camelContext;

    @Test
    public void testRoutesEndpoint() throws Exception {
        List<RouteEndpointInfo> routes = endpoint.readRoutes();

        Assertions.assertFalse(routes.isEmpty());
        Assertions.assertEquals(routes.size(), camelContext.getRoutes().size());
        Assertions.assertTrue(routes.stream().anyMatch(r -> "foo-route".equals(r.getId())));
        Assertions.assertTrue(routes.stream().anyMatch(r -> "foo-route-group".equals(r.getGroup())));
        Assertions.assertTrue(routes.stream()
                .anyMatch(r -> r.getProperties().containsKey("key1") && "val1".equals(r.getProperties().get("key1"))));
        Assertions.assertTrue(routes.stream()
                .anyMatch(r -> r.getProperties().containsKey("key2") && "val2".equals(r.getProperties().get("key2"))));
    }

    @Test
    public void testReadOperation() throws Exception {
        Object answer = endpoint.doReadAction("foo-route", ReadAction.INFO);
        Assertions.assertEquals(RouteEndpointInfo.class, answer.getClass());
        Assertions.assertEquals("foo-route", RouteEndpointInfo.class.cast(answer).getId());
        answer = endpoint.doReadAction("foo-route", ReadAction.DETAIL);
        Assertions.assertEquals(RouteDetailsEndpointInfo.class, answer.getClass());
    }

    @Test
    public void testWriteOperationReadOnly() throws Exception {
        TimeInfo timeInfo = new TimeInfo();
        timeInfo.setAbortAfterTimeout(true);
        timeInfo.setTimeout(5L);
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> endpoint.doWriteAction("foo-route", WriteAction.STOP, timeInfo));
    }

}
