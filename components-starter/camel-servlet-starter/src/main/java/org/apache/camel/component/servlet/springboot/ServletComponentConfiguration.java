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
package org.apache.camel.component.servlet.springboot;

import javax.annotation.Generated;
import org.apache.camel.http.common.HttpBinding;
import org.apache.camel.http.common.HttpConfiguration;
import org.apache.camel.http.common.HttpRegistry;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Serve HTTP requests by a Servlet.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.servlet")
public class ServletComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the servlet component. This is
     * enabled by default.
     */
    private Boolean enabled;
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
     * Default name of servlet to use. The default name is CamelServlet.
     */
    private String servletName = "CamelServlet";
    /**
     * Whether to automatic bind multipart/form-data as attachments on the Camel
     * Exchange. The options attachmentMultipartBinding=true and
     * disableStreamCache=false cannot work together. Remove disableStreamCache
     * to use AttachmentMultipartBinding. This is turn off by default as this
     * may require servlet specific configuration to enable this when using
     * Servlet's.
     */
    private Boolean attachmentMultipartBinding = false;
    /**
     * Whitelist of accepted filename extensions for accepting uploaded files.
     * Multiple extensions can be separated by comma, such as txt,xml.
     */
    private String fileNameExtWhitelist;
    /**
     * To use a custom org.apache.camel.component.servlet.HttpRegistry. The
     * option is a org.apache.camel.http.common.HttpRegistry type.
     */
    private HttpRegistry httpRegistry;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object. This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
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
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient. The option is a org.apache.camel.http.common.HttpBinding
     * type.
     */
    private HttpBinding httpBinding;
    /**
     * To use the shared HttpConfiguration as base configuration. The option is
     * a org.apache.camel.http.common.HttpConfiguration type.
     */
    private HttpConfiguration httpConfiguration;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message. The option is a
     * org.apache.camel.spi.HeaderFilterStrategy type.
     */
    private HeaderFilterStrategy headerFilterStrategy;

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getServletName() {
        return servletName;
    }

    public void setServletName(String servletName) {
        this.servletName = servletName;
    }

    public Boolean getAttachmentMultipartBinding() {
        return attachmentMultipartBinding;
    }

    public void setAttachmentMultipartBinding(Boolean attachmentMultipartBinding) {
        this.attachmentMultipartBinding = attachmentMultipartBinding;
    }

    public String getFileNameExtWhitelist() {
        return fileNameExtWhitelist;
    }

    public void setFileNameExtWhitelist(String fileNameExtWhitelist) {
        this.fileNameExtWhitelist = fileNameExtWhitelist;
    }

    public HttpRegistry getHttpRegistry() {
        return httpRegistry;
    }

    public void setHttpRegistry(HttpRegistry httpRegistry) {
        this.httpRegistry = httpRegistry;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public HttpBinding getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(HttpBinding httpBinding) {
        this.httpBinding = httpBinding;
    }

    public HttpConfiguration getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}