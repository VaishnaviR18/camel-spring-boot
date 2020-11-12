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
package org.apache.camel.component.crypto.cms.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.crypto.cms.crypt.EnvelopedDataDecryptorConfiguration;
import org.apache.camel.component.crypto.cms.sig.SignedDataVerifierConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Encrypt, decrypt, sign and verify data in CMS Enveloped Data format.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.crypto-cms")
public class CryptoCmsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the crypto-cms component. This is
     * enabled by default.
     */
    private Boolean enabled;
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
     * To configure the shared EnvelopedDataDecryptorConfiguration, which
     * determines the uri parameters for the decrypt operation. The option is a
     * org.apache.camel.component.crypto.cms.crypt.EnvelopedDataDecryptorConfiguration type.
     */
    private EnvelopedDataDecryptorConfiguration envelopedDataDecryptorConfiguration;
    /**
     * To configure the shared SignedDataVerifierConfiguration, which determines
     * the uri parameters for the verify operation. The option is a
     * org.apache.camel.component.crypto.cms.sig.SignedDataVerifierConfiguration
     * type.
     */
    private SignedDataVerifierConfiguration signedDataVerifierConfiguration;

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

    public EnvelopedDataDecryptorConfiguration getEnvelopedDataDecryptorConfiguration() {
        return envelopedDataDecryptorConfiguration;
    }

    public void setEnvelopedDataDecryptorConfiguration(
            EnvelopedDataDecryptorConfiguration envelopedDataDecryptorConfiguration) {
        this.envelopedDataDecryptorConfiguration = envelopedDataDecryptorConfiguration;
    }

    public SignedDataVerifierConfiguration getSignedDataVerifierConfiguration() {
        return signedDataVerifierConfiguration;
    }

    public void setSignedDataVerifierConfiguration(
            SignedDataVerifierConfiguration signedDataVerifierConfiguration) {
        this.signedDataVerifierConfiguration = signedDataVerifierConfiguration;
    }
}