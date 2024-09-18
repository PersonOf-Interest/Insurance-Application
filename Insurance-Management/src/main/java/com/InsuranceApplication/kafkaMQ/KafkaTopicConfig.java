package com.InsuranceApplication.kafkaMQ;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic claimEventsTopic() {
        return TopicBuilder.name("claim.events")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic policyEventsTopic() {
        return TopicBuilder.name("client.events")
                .partitions(3)
                .replicas(1)
                .build();
    }

    @Bean
    public NewTopic fraudAlertsTopic() {
        return TopicBuilder.name("insurancepolicy.alerts")
                .partitions(3)
                .replicas(1)
                .build();
    }
}
