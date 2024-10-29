package br.com.kafka.teste.kafka.controller;

import br.com.kafka.teste.kafka.enums.TopicEnum;
import br.com.kafka.teste.kafka.kafka.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class kafkaController {

    private final Producer producer;

    @GetMapping("/producer")
    public ResponseEntity producer(TopicEnum topic, String message){
        producer.producer(topic, message);
        return ResponseEntity.noContent().build();
    }
}
