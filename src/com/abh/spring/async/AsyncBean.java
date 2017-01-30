package com.abh.spring.async;

import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class AsyncBean {

    @Async
    public void doSomethingAsync() {
        System.out.println(new Date() + " Entered async=>" + Thread.currentThread());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(new Date() + "Leaving async=>" + Thread.currentThread());

    }
}
