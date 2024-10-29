package br.com.kafka.teste.kafka.kafka;

import br.com.kafka.teste.kafka.enums.TopicEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Producer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void producer(TopicEnum topic, String message){
        kafkaTemplate.send(topic.getTopic(), message);
    }
}
