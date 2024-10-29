package br.com.kafka.teste.kafka.enums;

import lombok.Getter;

@Getter
public enum TopicEnum {
    TESTE("teste"),
    TESTE2("teste-2");

    private final String topic;

    TopicEnum(String topic) {
        this.topic = topic;
    }
}
