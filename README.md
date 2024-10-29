Esse projeto tem o intuido de descrever uma implementação de produção e consumo de um topic kafka.


Foi criada uma controler pra receber o topic e menssagem e o sistem realizar o send e a mesma aplicação realiza o consumo.
O sistema suporta somente duas filas as mesmas estão parametrizadas no enum TopicEnum.
Para o consumo foi criada a classe abstrata ConsumerAbstract onde e realizado o consumo do topic, cada novo topic precisa implementar uma nossa classe e extender da classe ConsumerAbstract
Foi criado a classe ConsumerFilaTeste2Impl e ConsumerFilaTesteImpl para implementar os metodos getNomeTopico e getGroupId.

Para realizar o teste na aplicação e só executar os endpoint abaixo para verificar a escrita e leitura.

http://localhost:8080/v1/producer?topic=TESTE&message=teste_topic_teste

http://localhost:8080/v1/producer?topic=TESTE&message=teste_topic_teste2

A aplicação era enviar a mensagem para o kafka e consumir a mensagem e printando no log
Foi criada a configuração para o kafka no aplication.properties para consumir o serviço na porta 9092
(spring.kafka.bootstrap-servers=localhost:9092)
Sendo assim, para a aplicação subir precisa ter um kafka rodando na porta 9092, caso o kafka esteja rodando em outra porta será necessário alterar a porta na aplicação.
