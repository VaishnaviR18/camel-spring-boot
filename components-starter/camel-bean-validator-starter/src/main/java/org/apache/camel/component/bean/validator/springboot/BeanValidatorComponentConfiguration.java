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
package org.apache.camel.component.bean.validator.springboot;

import javax.annotation.Generated;
import javax.validation.ConstraintValidatorFactory;
import javax.validation.MessageInterpolator;
import javax.validation.TraversableResolver;
import javax.validation.ValidationProviderResolver;
import javax.validation.ValidatorFactory;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Validate the message body using the Java Bean Validation API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.bean-validator")
public class BeanValidatorComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the bean-validator component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether to ignore data from the META-INF/validation.xml file.
     */
    private Boolean ignoreXmlConfiguration = false;
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
     * To use a custom ConstraintValidatorFactory. The option is a
     * javax.validation.ConstraintValidatorFactory type.
     */
    private ConstraintValidatorFactory constraintValidatorFactory;
    /**
     * To use a custom MessageInterpolator. The option is a
     * javax.validation.MessageInterpolator type.
     */
    private MessageInterpolator messageInterpolator;
    /**
     * To use a custom TraversableResolver. The option is a
     * javax.validation.TraversableResolver type.
     */
    private TraversableResolver traversableResolver;
    /**
     * To use a a custom ValidationProviderResolver. The option is a
     * javax.validation.ValidationProviderResolver type.
     */
    private ValidationProviderResolver validationProviderResolver;
    /**
     * To use a custom ValidatorFactory. The option is a
     * javax.validation.ValidatorFactory type.
     */
    private ValidatorFactory validatorFactory;

    public Boolean getIgnoreXmlConfiguration() {
        return ignoreXmlConfiguration;
    }

    public void setIgnoreXmlConfiguration(Boolean ignoreXmlConfiguration) {
        this.ignoreXmlConfiguration = ignoreXmlConfiguration;
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

    public ConstraintValidatorFactory getConstraintValidatorFactory() {
        return constraintValidatorFactory;
    }

    public void setConstraintValidatorFactory(
            ConstraintValidatorFactory constraintValidatorFactory) {
        this.constraintValidatorFactory = constraintValidatorFactory;
    }

    public MessageInterpolator getMessageInterpolator() {
        return messageInterpolator;
    }

    public void setMessageInterpolator(MessageInterpolator messageInterpolator) {
        this.messageInterpolator = messageInterpolator;
    }

    public TraversableResolver getTraversableResolver() {
        return traversableResolver;
    }

    public void setTraversableResolver(TraversableResolver traversableResolver) {
        this.traversableResolver = traversableResolver;
    }

    public ValidationProviderResolver getValidationProviderResolver() {
        return validationProviderResolver;
    }

    public void setValidationProviderResolver(
            ValidationProviderResolver validationProviderResolver) {
        this.validationProviderResolver = validationProviderResolver;
    }

    public ValidatorFactory getValidatorFactory() {
        return validatorFactory;
    }

    public void setValidatorFactory(ValidatorFactory validatorFactory) {
        this.validatorFactory = validatorFactory;
    }
}