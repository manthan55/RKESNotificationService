package com.manthan.rkesnotificationservice.consumers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {
    private static final Logger LOG = LoggerFactory.getLogger(NotificationConsumer.class);

    @KafkaListener(topics="sendNotification", groupId = "rkesNotificationService")
    public void handleNotification(String message) {
        LOG.info("topic:sendNotification -- message:"+message);
    }
}
