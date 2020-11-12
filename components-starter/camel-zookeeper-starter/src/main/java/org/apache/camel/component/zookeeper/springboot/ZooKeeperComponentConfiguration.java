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
package org.apache.camel.component.zookeeper.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.zookeeper.ZooKeeperConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Manage ZooKeeper clusters.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.zookeeper")
public class ZooKeeperComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the zookeeper component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether the children of the node should be listed
     */
    private Boolean listChildren = false;
    /**
     * The time interval to wait on connection before timing out.
     */
    private Integer timeout = 5000;
    /**
     * The time interval to backoff for after an error before retrying.
     */
    private Long backoff = 5000L;
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
     * Should changes to the znode be 'watched' and repeatedly processed.
     */
    private Boolean repeat = false;
    /**
     * Upon the delete of a znode, should an empty message be send to the
     * consumer
     */
    private Boolean sendEmptyMessageOnDelete = true;
    /**
     * Should the endpoint create the node if it does not currently exist.
     */
    private Boolean create = false;
    /**
     * The create mode that should be used for the newly created node
     */
    private String createMode = "EPHEMERAL";
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
     * Whether autowiring is enabled. This is used for automatic autowiring
     * options (the option must be marked as autowired) by looking up in the
     * registry to find if there is a single instance of matching type, which
     * then gets configured on the component. This can be used for automatic
     * configuring JDBC data sources, JMS connection factories, AWS Clients,
     * etc.
     */
    private Boolean autowiredEnabled = true;
    /**
     * To use a shared ZooKeeperConfiguration. The option is a
     * org.apache.camel.component.zookeeper.ZooKeeperConfiguration type.
     */
    private ZooKeeperConfiguration configuration;

    public Boolean getListChildren() {
        return listChildren;
    }

    public void setListChildren(Boolean listChildren) {
        this.listChildren = listChildren;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Long getBackoff() {
        return backoff;
    }

    public void setBackoff(Long backoff) {
        this.backoff = backoff;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public Boolean getRepeat() {
        return repeat;
    }

    public void setRepeat(Boolean repeat) {
        this.repeat = repeat;
    }

    public Boolean getSendEmptyMessageOnDelete() {
        return sendEmptyMessageOnDelete;
    }

    public void setSendEmptyMessageOnDelete(Boolean sendEmptyMessageOnDelete) {
        this.sendEmptyMessageOnDelete = sendEmptyMessageOnDelete;
    }

    public Boolean getCreate() {
        return create;
    }

    public void setCreate(Boolean create) {
        this.create = create;
    }

    public String getCreateMode() {
        return createMode;
    }

    public void setCreateMode(String createMode) {
        this.createMode = createMode;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public ZooKeeperConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ZooKeeperConfiguration configuration) {
        this.configuration = configuration;
    }
}