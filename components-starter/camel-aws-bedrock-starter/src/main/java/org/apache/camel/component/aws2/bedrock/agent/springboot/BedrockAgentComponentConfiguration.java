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
package org.apache.camel.component.aws2.bedrock.agent.springboot;

import org.apache.camel.component.aws2.bedrock.agent.BedrockAgentComponent;
import org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration;
import org.apache.camel.component.aws2.bedrock.agent.BedrockAgentOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import software.amazon.awssdk.core.Protocol;
import software.amazon.awssdk.services.bedrockagent.BedrockAgentClient;

/**
 * Operate on AWS Bedrock through its Agent.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.aws-bedrock-agent")
public class BedrockAgentComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-bedrock-agent component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Component configuration. The option is a
     * org.apache.camel.component.aws2.bedrock.agent.BedrockAgentConfiguration
     * type.
     */
    private BedrockAgentConfiguration configuration;
    /**
     * Define the Data source Id we are going to use
     */
    private String dataSourceId;
    /**
     * Define the Knowledge Base Id we are going to use
     */
    private String knowledgeBaseId;
    /**
     * Define the model Id we are going to use
     */
    private String modelId;
    /**
     * The operation to perform
     */
    private BedrockAgentOperations operation;
    /**
     * Set the need for overriding the endpoint. This option needs to be used in
     * combination with the uriEndpointOverride option
     */
    private Boolean overrideEndpoint = false;
    /**
     * If we want to use a POJO request as body or not
     */
    private Boolean pojoRequest = false;
    /**
     * If using a profile credentials provider, this parameter will set the
     * profile name
     */
    private String profileCredentialsName = "false";
    /**
     * The region in which Bedrock Agent client needs to work. When using this
     * parameter, the configuration will expect the lowercase name of the region
     * (for example, ap-east-1) You'll need to use the name
     * Region.EU_WEST_1.id()
     */
    private String region;
    /**
     * Set the overriding uri endpoint. This option needs to be used in
     * combination with overrideEndpoint option
     */
    private String uriEndpointOverride;
    /**
     * Set whether the Bedrock Agent client should expect to load credentials
     * through a default credentials provider or to expect static credentials to
     * be passed in.
     */
    private Boolean useDefaultCredentialsProvider = false;
    /**
     * Set whether the Bedrock Agent client should expect to load credentials
     * through a profile credentials provider.
     */
    private Boolean useProfileCredentialsProvider = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions (if possible) occurred while the Camel consumer
     * is trying to pickup incoming messages, or the likes, will now be
     * processed as a message and handled by the routing Error Handler.
     * Important: This is only possible if the 3rd party component allows Camel
     * to be alerted if an exception was thrown. Some components handle this
     * internally only, and therefore bridgeErrorHandler is not possible. In
     * other situations we may improve the Camel component to hook into the 3rd
     * party component and make this possible for future releases. By default
     * the consumer will use the org.apache.camel.spi.ExceptionHandler to deal
     * with exceptions, that will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;
    /**
     * Define the Ingestion Job Id we want to track
     */
    private String ingestionJobId;
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
     * To use an existing configured AWS Bedrock Agent client. The option is a
     * software.amazon.awssdk.services.bedrockagent.BedrockAgentClient type.
     */
    private BedrockAgentClient bedrockAgentClient;
    /**
     * Used for enabling or disabling all consumer based health checks from this
     * component
     */
    private Boolean healthCheckConsumerEnabled = true;
    /**
     * Used for enabling or disabling all producer based health checks from this
     * component. Notice: Camel has by default disabled all producer based
     * health-checks. You can turn on producer checks globally by setting
     * camel.health.producersEnabled=true.
     */
    private Boolean healthCheckProducerEnabled = true;
    /**
     * To define a proxy host when instantiating the Bedrock Agent client
     */
    private String proxyHost;
    /**
     * To define a proxy port when instantiating the Bedrock Agent client
     */
    private Integer proxyPort;
    /**
     * To define a proxy protocol when instantiating the Bedrock Agent client
     */
    private Protocol proxyProtocol = Protocol.HTTPS;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Amazon AWS Session Token used when the user needs to assume an IAM role
     */
    private String sessionToken;
    /**
     * If we want to trust all certificates in case of overriding the endpoint
     */
    private Boolean trustAllCertificates = false;
    /**
     * Set whether the Bedrock Agent client should expect to use Session
     * Credentials. This is useful in a situation in which the user needs to
     * assume an IAM role for doing operations in Bedrock.
     */
    private Boolean useSessionCredentials = false;

    public BedrockAgentConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(BedrockAgentConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getKnowledgeBaseId() {
        return knowledgeBaseId;
    }

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public BedrockAgentOperations getOperation() {
        return operation;
    }

    public void setOperation(BedrockAgentOperations operation) {
        this.operation = operation;
    }

    public Boolean getOverrideEndpoint() {
        return overrideEndpoint;
    }

    public void setOverrideEndpoint(Boolean overrideEndpoint) {
        this.overrideEndpoint = overrideEndpoint;
    }

    public Boolean getPojoRequest() {
        return pojoRequest;
    }

    public void setPojoRequest(Boolean pojoRequest) {
        this.pojoRequest = pojoRequest;
    }

    public String getProfileCredentialsName() {
        return profileCredentialsName;
    }

    public void setProfileCredentialsName(String profileCredentialsName) {
        this.profileCredentialsName = profileCredentialsName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUriEndpointOverride() {
        return uriEndpointOverride;
    }

    public void setUriEndpointOverride(String uriEndpointOverride) {
        this.uriEndpointOverride = uriEndpointOverride;
    }

    public Boolean getUseDefaultCredentialsProvider() {
        return useDefaultCredentialsProvider;
    }

    public void setUseDefaultCredentialsProvider(
            Boolean useDefaultCredentialsProvider) {
        this.useDefaultCredentialsProvider = useDefaultCredentialsProvider;
    }

    public Boolean getUseProfileCredentialsProvider() {
        return useProfileCredentialsProvider;
    }

    public void setUseProfileCredentialsProvider(
            Boolean useProfileCredentialsProvider) {
        this.useProfileCredentialsProvider = useProfileCredentialsProvider;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getIngestionJobId() {
        return ingestionJobId;
    }

    public void setIngestionJobId(String ingestionJobId) {
        this.ingestionJobId = ingestionJobId;
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

    public BedrockAgentClient getBedrockAgentClient() {
        return bedrockAgentClient;
    }

    public void setBedrockAgentClient(BedrockAgentClient bedrockAgentClient) {
        this.bedrockAgentClient = bedrockAgentClient;
    }

    public Boolean getHealthCheckConsumerEnabled() {
        return healthCheckConsumerEnabled;
    }

    public void setHealthCheckConsumerEnabled(Boolean healthCheckConsumerEnabled) {
        this.healthCheckConsumerEnabled = healthCheckConsumerEnabled;
    }

    public Boolean getHealthCheckProducerEnabled() {
        return healthCheckProducerEnabled;
    }

    public void setHealthCheckProducerEnabled(Boolean healthCheckProducerEnabled) {
        this.healthCheckProducerEnabled = healthCheckProducerEnabled;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public Protocol getProxyProtocol() {
        return proxyProtocol;
    }

    public void setProxyProtocol(Protocol proxyProtocol) {
        this.proxyProtocol = proxyProtocol;
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

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public Boolean getTrustAllCertificates() {
        return trustAllCertificates;
    }

    public void setTrustAllCertificates(Boolean trustAllCertificates) {
        this.trustAllCertificates = trustAllCertificates;
    }

    public Boolean getUseSessionCredentials() {
        return useSessionCredentials;
    }

    public void setUseSessionCredentials(Boolean useSessionCredentials) {
        this.useSessionCredentials = useSessionCredentials;
    }
}