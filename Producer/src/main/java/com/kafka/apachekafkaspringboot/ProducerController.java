package com.kafka.apachekafkaspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProducerController {

//    @Autowired
//    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;

    public static final String TOPIC = "SpringTopic";

    @PostMapping
    public String publishMessage(@RequestBody User message){
        System.out.println(message);
        kafkaTemplate.send(TOPIC, message);
        return "Published";
    }
}
