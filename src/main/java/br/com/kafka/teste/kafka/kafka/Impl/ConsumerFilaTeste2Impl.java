package br.com.kafka.teste.kafka.kafka.Impl;

import br.com.kafka.teste.kafka.enums.TopicEnum;
import br.com.kafka.teste.kafka.kafka.ConsumerAbstract;
import org.springframework.stereotype.Component;

@Component
public class ConsumerFilaTeste2Impl extends ConsumerAbstract {
    @Override
    public String getNomeTopico() {
        return TopicEnum.TESTE2.getTopic();
    }

    @Override
    public String getGroupId() {
        return TopicEnum.TESTE2.getTopic();
    }
}
