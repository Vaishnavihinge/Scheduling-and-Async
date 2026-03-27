package com.schedulerasyncdemo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async
    public void sendNotification() {
        try {
            System.out.println("Sending notification");
            Thread.sleep(4000);

            System.out.println("Notification sent!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
