package br.edu.ifrs.riogrande.tads.ppa.negocio;

import br.edu.ifrs.riogrande.tads.ppa.configuracao.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NewUserEventListener {

    @RabbitListener(queues = RabbitMQConfig.USER_QUEUE)
    public void newUser(NewUserEvent event) {
        
    }
}