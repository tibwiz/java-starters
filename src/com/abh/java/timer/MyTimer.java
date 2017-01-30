package com.abh.java.timer;

import java.util.Date;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class MyTimer {

    public MyTimer() {
        System.out.println("In MyTimer constrictor");
    }

    @Scheduled(fixedDelay = 1000)
    public void call() {
        System.out.println(new Date() + " Entering schedule call" + Thread.currentThread());
        try {
            Thread.sleep(2345);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(new Date() + " Exiting schedule call" + Thread.currentThread());

    }
}
