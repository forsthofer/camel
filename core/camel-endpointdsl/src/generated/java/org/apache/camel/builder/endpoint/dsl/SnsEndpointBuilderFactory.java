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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.HeaderFilterStrategy;

/**
 * Send messages to an AWS Simple Notification Topic.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SnsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS Simple Notification System (SNS)
     * component.
     */
    public interface SnsEndpointBuilder extends EndpointProducerBuilder {
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option is a:
         * &lt;code&gt;com.amazonaws.services.sns.AmazonSNS&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonSNSClient the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder amazonSNSClient(Object amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * To use the AmazonSNS as the client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.amazonaws.services.sns.AmazonSNS&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonSNSClient the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder amazonSNSClient(String amazonSNSClient) {
            doSetProperty("amazonSNSClient", amazonSNSClient);
            return this;
        }
        /**
         * An SQS Client to use as bridge between SNS and SQS.
         * 
         * The option is a:
         * &lt;code&gt;com.amazonaws.services.sqs.AmazonSQS&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonSQSClient the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder amazonSQSClient(Object amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * An SQS Client to use as bridge between SNS and SQS.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.amazonaws.services.sqs.AmazonSQS&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonSQSClient the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder amazonSQSClient(String amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param autoCreateTopic the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder autoCreateTopic(boolean autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * Setting the autocreation of the topic.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param autoCreateTopic the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder autoCreateTopic(String autoCreateTopic) {
            doSetProperty("autoCreateTopic", autoCreateTopic);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder autoDiscoverClient(boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder autoDiscoverClient(String autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to map headers to/from Camel.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder headerFilterStrategy(
                HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a custom HeaderFilterStrategy to map headers to/from Camel.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: producer
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder headerFilterStrategy(
                String headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or
         * a custom CMK.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param kmsMasterKeyId the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder kmsMasterKeyId(String kmsMasterKeyId) {
            doSetProperty("kmsMasterKeyId", kmsMasterKeyId);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The message structure to use such as json.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param messageStructure the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder messageStructure(String messageStructure) {
            doSetProperty("messageStructure", messageStructure);
            return this;
        }
        /**
         * The policy for this queue.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param policy the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder policy(String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SNS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option is a: &lt;code&gt;com.amazonaws.Protocol&lt;/code&gt;
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SNS client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.amazonaws.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The queueUrl to subscribe to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param queueUrl the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder queueUrl(String queueUrl) {
            doSetProperty("queueUrl", queueUrl);
            return this;
        }
        /**
         * The region in which SNS client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param serverSideEncryptionEnabled the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the topic.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param serverSideEncryptionEnabled the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder serverSideEncryptionEnabled(
                String serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The subject which is used if the message header 'CamelAwsSnsSubject'
         * is not present.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param subject the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder subject(String subject) {
            doSetProperty("subject", subject);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param subscribeSNStoSQS the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder subscribeSNStoSQS(boolean subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Define if the subscription between SNS Topic and SQS must be done or
         * not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param subscribeSNStoSQS the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder subscribeSNStoSQS(String subscribeSNStoSQS) {
            doSetProperty("subscribeSNStoSQS", subscribeSNStoSQS);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default SnsEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Proxy enum for <code>com.amazonaws.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface SnsBuilders {
        /**
         * AWS Simple Notification System (SNS) (camel-aws-sns)
         * Send messages to an AWS Simple Notification Topic.
         * 
         * Category: cloud,messaging,mobile
         * Since: 2.8
         * Maven coordinates: org.apache.camel:camel-aws-sns
         * 
         * Syntax: <code>aws-sns:topicNameOrArn</code>
         * 
         * Path parameter: topicNameOrArn (required)
         * Topic name or ARN
         * 
         * @param path topicNameOrArn
         * @return the dsl builder
         */
        @Deprecated
        default SnsEndpointBuilder awsSns(String path) {
            return SnsEndpointBuilderFactory.endpointBuilder("aws-sns", path);
        }
        /**
         * AWS Simple Notification System (SNS) (camel-aws-sns)
         * Send messages to an AWS Simple Notification Topic.
         * 
         * Category: cloud,messaging,mobile
         * Since: 2.8
         * Maven coordinates: org.apache.camel:camel-aws-sns
         * 
         * Syntax: <code>aws-sns:topicNameOrArn</code>
         * 
         * Path parameter: topicNameOrArn (required)
         * Topic name or ARN
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path topicNameOrArn
         * @return the dsl builder
         */
        @Deprecated
        default SnsEndpointBuilder awsSns(String componentName, String path) {
            return SnsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    @Deprecated
    static SnsEndpointBuilder endpointBuilder(String componentName, String path) {
        class SnsEndpointBuilderImpl extends AbstractEndpointBuilder implements SnsEndpointBuilder {
            public SnsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SnsEndpointBuilderImpl(path);
    }
}