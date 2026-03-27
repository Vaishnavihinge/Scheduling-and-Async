package com.schedulerasyncdemo.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedular {

    @Scheduled(cron = "0 */10 * * * ?")
    public void logData() {
        System.out.println("Logging data at :" + System.currentTimeMillis());
    }
}


