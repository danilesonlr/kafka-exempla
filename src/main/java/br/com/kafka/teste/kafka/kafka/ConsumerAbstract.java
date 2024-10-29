package br.com.kafka.teste.kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;

public abstract class ConsumerAbstract {

    @KafkaListener(topics = "#{__listener.getNomeTopico()}", groupId = "#{__listener.getGroupId()}")
    public void consumer(String message){
        System.out.println(message);
    }

    protected abstract String getNomeTopico();
    protected abstract String getGroupId();
}
