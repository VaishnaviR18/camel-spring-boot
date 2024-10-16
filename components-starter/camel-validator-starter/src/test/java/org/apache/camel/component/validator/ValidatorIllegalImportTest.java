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
package org.apache.camel.component.validator;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.spring.boot.CamelAutoConfiguration;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 *
 */
@DirtiesContext
@CamelSpringBootTest
@SpringBootTest(
        classes = {
                CamelAutoConfiguration.class,
                ValidatorIllegalImportTest.class
        }
)
public class ValidatorIllegalImportTest extends ContextTestSupport {

    private final String broadCastEvent
            = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" + "<BroadcastMonitor> "
              + "<updated>2012-03-01T03:46:26</updated>"
              + "<stationName>P7 Mix</stationName>" + "<Current>" + "<startTime>2012-03-01T03:46:26</startTime>"
              + "<itemId>1000736343:8505553</itemId>"
              + "<titleId>785173</titleId>" + "<itemCode>9004342-0101</itemCode>" + "<itemReference></itemReference>"
              + "<titleName>Part Of Me</titleName>" + "<artistName>Katy Perry</artistName>" + "<albumName></albumName>"
              + "</Current>" + "<Next>"
              + "<startTime>2012-03-01T03:50:00</startTime>" + "<itemId>1000736343:8505554</itemId>"
              + "<titleId>780319</titleId>"
              + "<itemCode>2318050-0101</itemCode>" + "<itemReference></itemReference>" + "<titleName>Fine</titleName>"
              + "<artistName>Whitney Houston</artistName>" + "<albumName></albumName>" + "</Next>" + "</BroadcastMonitor>";

    @Test
    public void testOk() throws Exception {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:test").to("validator:org/apache/camel/component/validator/BroadcastMonitorFixed.xsd")
                        .to("mock:result");
            }
        });

        MockEndpoint mock = context.getEndpoint("mock:result", MockEndpoint.class);
        mock.expectedMessageCount(1);
        template.sendBody("direct:test", broadCastEvent);
        mock.assertIsSatisfied();
    }

    @Test
    public void testIllegalImport() throws Exception {
        try {
            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {
                    from("direct:test").to("validator:org/apache/camel/component/validator/BroadcastMonitor.xsd").to("mock:result");
                }
            });
            fail("Should have thrown exception");
        } catch (Exception e) {
            IllegalArgumentException iae = assertIsInstanceOf(IllegalArgumentException.class, e.getCause().getCause());
            assertTrue(iae.getMessage().startsWith(
                    "Resource: org/apache/camel/component/validator/BroadcastMonitor.xsd refers an invalid resource without SystemId."));
        }
    }
}
