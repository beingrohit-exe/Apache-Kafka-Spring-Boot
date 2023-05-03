package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "SpringTopic", groupId = "group-id")
    public void consume(String message){
        System.out.println("Messages : " + message);
    }
}
