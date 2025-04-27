package br.edu.ifrs.riogrande.tads.ppa.business.listeners;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.edu.ifrs.riogrande.tads.ppa.business.models.NewUserEvent;
import br.edu.ifrs.riogrande.tads.ppa.config.RabbitMQConfig;

@Component
public class NewUserEventListener {

    @RabbitListener(queues = RabbitMQConfig.USER_QUEUE)
    public void newUser(NewUserEvent event) {

    }
}