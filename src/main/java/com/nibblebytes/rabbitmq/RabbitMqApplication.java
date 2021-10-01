package com.nibblebytes.rabbitmq;

import com.nibblebytes.rabbitmq.model.Notification;
import com.nibblebytes.rabbitmq.producer.NotificationProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class RabbitMqApplication {


    public static void main(String[] args) {
        SpringApplication.run(RabbitMqApplication.class, args);

    }

}
