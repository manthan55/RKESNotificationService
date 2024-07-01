package com.manthan.rkesnotificationservice.consumers;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics="sendNotification", groupId = "notificationService")
    public void handleNotification(String message) {
        System.out.println(message);
    }
}
