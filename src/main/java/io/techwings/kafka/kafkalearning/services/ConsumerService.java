package io.techwings.kafka.kafkalearning.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import io.techwings.kafka.kafkalearning.dto.Party;

@Service
@Order(3)
public class ConsumerService {

    private static final Logger LOG = LoggerFactory.getLogger(ConsumerService.class);

    @KafkaListener(id = "myId", topics = "first_topic")
    public void listen(Party val) {
        LOG.info("Listening...");
        System.out.println(val.toString());
    }
}