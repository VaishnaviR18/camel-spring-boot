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
package org.apache.camel.component.rocketmq.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Send and receive messages from RocketMQ cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.rocketmq")
public class RocketMQComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the rocketmq component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Name server address of RocketMQ cluster.
     */
    private String namesrvAddr = "localhost:9876";
    /**
     * Each message would be sent with this tag.
     */
    private String sendTag;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Consumer group name.
     */
    private String consumerGroup;
    /**
     * Subscribe tags of consumer. Multiple tags could be split by , such as
     * TagATagB
     */
    private String subscribeTags = "*";
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Producer group name.
     */
    private String producerGroup;
    /**
     * Consumer group name used for receiving response.
     */
    private String replyToConsumerGroup;
    /**
     * Topic used for receiving response when using in-out pattern.
     */
    private String replyToTopic;
    /**
     * Whether waiting for send result before routing to next endpoint.
     */
    private Boolean waitForSendResult = false;
    /**
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * Check interval milliseconds of request timeout.
     */
    private Long requestTimeoutCheckerIntervalMillis = 1000L;
    /**
     * Timeout milliseconds of receiving response when using in-out pattern.
     */
    private Long requestTimeoutMillis = 10000L;
    /**
     * Access key for RocketMQ ACL.
     */
    private String accessKey;
    /**
     * Secret key for RocketMQ ACL.
     */
    private String secretKey;

    public String getNamesrvAddr() {
        return namesrvAddr;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }

    public String getSendTag() {
        return sendTag;
    }

    public void setSendTag(String sendTag) {
        this.sendTag = sendTag;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getConsumerGroup() {
        return consumerGroup;
    }

    public void setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
    }

    public String getSubscribeTags() {
        return subscribeTags;
    }

    public void setSubscribeTags(String subscribeTags) {
        this.subscribeTags = subscribeTags;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getReplyToConsumerGroup() {
        return replyToConsumerGroup;
    }

    public void setReplyToConsumerGroup(String replyToConsumerGroup) {
        this.replyToConsumerGroup = replyToConsumerGroup;
    }

    public String getReplyToTopic() {
        return replyToTopic;
    }

    public void setReplyToTopic(String replyToTopic) {
        this.replyToTopic = replyToTopic;
    }

    public Boolean getWaitForSendResult() {
        return waitForSendResult;
    }

    public void setWaitForSendResult(Boolean waitForSendResult) {
        this.waitForSendResult = waitForSendResult;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public Long getRequestTimeoutCheckerIntervalMillis() {
        return requestTimeoutCheckerIntervalMillis;
    }

    public void setRequestTimeoutCheckerIntervalMillis(
            Long requestTimeoutCheckerIntervalMillis) {
        this.requestTimeoutCheckerIntervalMillis = requestTimeoutCheckerIntervalMillis;
    }

    public Long getRequestTimeoutMillis() {
        return requestTimeoutMillis;
    }

    public void setRequestTimeoutMillis(Long requestTimeoutMillis) {
        this.requestTimeoutMillis = requestTimeoutMillis;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}