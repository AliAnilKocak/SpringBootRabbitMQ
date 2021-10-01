package com.nibblebytes.rabbitmq.listener;

import com.nibblebytes.rabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @RabbitListener(queues = "nibblebytes-queue")
    public void handleOnMessage(Notification notification){
        System.out.println("Message received");
        System.out.println(notification.toString());
    }
}
