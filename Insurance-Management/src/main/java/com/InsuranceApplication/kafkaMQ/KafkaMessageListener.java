package com.InsuranceApplication.kafkaMQ;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    @KafkaListener(topics = "claim.events", groupId = "insurance-app")
    public void listenClaimEvents(Object message) {
        System.out.println("Received claim event: " + message);
        // Add your claim processing logic here
    }

    @KafkaListener(topics = "client.events", groupId = "insurance-app")
    public void listenPolicyEvents(Object message) {
        System.out.println("Received client event: " + message);
        // Add your policy processing logic here
    }

    @KafkaListener(topics = "insurancepolicy.alerts", groupId = "insurance-app")
    public void listenFraudAlerts(Object message) {
        System.out.println("Received insurancepolicy alert: " + message);
        // Add your fraud alert processing logic here
    }
}
