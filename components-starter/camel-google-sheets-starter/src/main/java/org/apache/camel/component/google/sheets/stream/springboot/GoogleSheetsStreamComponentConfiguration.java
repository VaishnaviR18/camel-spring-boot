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
package org.apache.camel.component.google.sheets.stream.springboot;

import java.util.List;
import javax.annotation.Generated;
import org.apache.camel.component.google.sheets.GoogleSheetsClientFactory;
import org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Poll for changes in Google Sheets.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.google-sheets-stream")
public class GoogleSheetsStreamComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the google-sheets-stream
     * component. This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Google sheets application name. Example would be camel-google-sheets/1.0
     */
    private String applicationName;
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
     * Client ID of the sheets application
     */
    private String clientId;
    /**
     * To use the shared configuration. The option is a
     * org.apache.camel.component.google.sheets.stream.GoogleSheetsStreamConfiguration type.
     */
    private GoogleSheetsStreamConfiguration configuration;
    /**
     * True if grid data should be returned.
     */
    private Boolean includeGridData = false;
    /**
     * Specifies the major dimension that results should use..
     */
    private String majorDimension = "ROWS";
    /**
     * Specify the maximum number of returned results. This will limit the
     * number of rows in a returned value range data set or the number of
     * returned value ranges in a batch request.
     */
    private Integer maxResults;
    /**
     * Specifies the range of rows and columns in a sheet to get data from.
     */
    private String range;
    /**
     * Specifies the level of permissions you want a sheets application to have
     * to a user account. See
     * https://developers.google.com/identity/protocols/googlescopes for more
     * info.
     */
    private List<String> scopes;
    /**
     * True if value range result should be split into rows or columns to
     * process each of them individually. When true each row or column is
     * represented with a separate exchange in batch processing. Otherwise value
     * range object is used as exchange junk size.
     */
    private Boolean splitResults = false;
    /**
     * Specifies the spreadsheet identifier that is used to identify the target
     * to obtain.
     */
    private String spreadsheetId;
    /**
     * Determines how values should be rendered in the output.
     */
    private String valueRenderOption = "FORMATTED_VALUE";
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
     * To use the GoogleSheetsClientFactory as factory for creating the client.
     * Will by default use BatchGoogleSheetsClientFactory. The option is a
     * org.apache.camel.component.google.sheets.GoogleSheetsClientFactory type.
     */
    private GoogleSheetsClientFactory clientFactory;
    /**
     * OAuth 2 access token. This typically expires after an hour so
     * refreshToken is recommended for long term usage.
     */
    private String accessToken;
    /**
     * Client secret of the sheets application
     */
    private String clientSecret;
    /**
     * OAuth 2 refresh token. Using this, the Google Calendar component can
     * obtain a new accessToken whenever the current one expires - a necessity
     * if the application is long-lived.
     */
    private String refreshToken;

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public GoogleSheetsStreamConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(GoogleSheetsStreamConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getIncludeGridData() {
        return includeGridData;
    }

    public void setIncludeGridData(Boolean includeGridData) {
        this.includeGridData = includeGridData;
    }

    public String getMajorDimension() {
        return majorDimension;
    }

    public void setMajorDimension(String majorDimension) {
        this.majorDimension = majorDimension;
    }

    public Integer getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

    public Boolean getSplitResults() {
        return splitResults;
    }

    public void setSplitResults(Boolean splitResults) {
        this.splitResults = splitResults;
    }

    public String getSpreadsheetId() {
        return spreadsheetId;
    }

    public void setSpreadsheetId(String spreadsheetId) {
        this.spreadsheetId = spreadsheetId;
    }

    public String getValueRenderOption() {
        return valueRenderOption;
    }

    public void setValueRenderOption(String valueRenderOption) {
        this.valueRenderOption = valueRenderOption;
    }

    public Boolean getAutowiredEnabled() {
        return autowiredEnabled;
    }

    public void setAutowiredEnabled(Boolean autowiredEnabled) {
        this.autowiredEnabled = autowiredEnabled;
    }

    public GoogleSheetsClientFactory getClientFactory() {
        return clientFactory;
    }

    public void setClientFactory(GoogleSheetsClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}