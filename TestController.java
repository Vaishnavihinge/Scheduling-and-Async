package com.schedulerasyncdemo.controller;

import com.schedulerasyncdemo.service.NotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final NotificationService service;

    public TestController(NotificationService service) {
        this.service = service;
    }

    @GetMapping("/notify")
    public String notifyUser (){

        service.sendNotification();
        return "Notification request sent";
    }
}
