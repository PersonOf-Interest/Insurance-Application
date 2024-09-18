package com.InsuranceApplication.kafkaMQ;
import com.InsuranceApplication.DTO.Claim;
import com.InsuranceApplication.DTO.Client;
import com.InsuranceApplication.DTO.InsurancePolicy;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class KafkaMessagingController extends Claim {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public KafkaMessagingController(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish/claim")
    public String publishClaim(@RequestBody Claim claim) {
        kafkaTemplate.send("claim.events", claim);
        return "Claim event published!";
    }

    @PostMapping("/publish/client")
    public String publishClientEvent(@RequestBody Client client) {
        kafkaTemplate.send("client.events", client);
        return "Client event published!";
    }

    @PostMapping("/publish/insurancepolicy")
    public String publishFraudAlert(@RequestBody InsurancePolicy insurancePolicy) {
        kafkaTemplate.send("insurancepolicy.events", insurancePolicy);
        return "Insurance Policy event published!";
    }
}
