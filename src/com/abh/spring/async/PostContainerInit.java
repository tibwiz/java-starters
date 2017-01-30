package com.abh.spring.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class PostContainerInit implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private AsyncBean asyncBean;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        System.out.println("Entered PostContainerInit=>" + Thread.currentThread());
        asyncBean.doSomethingAsync();
        System.out.println("Leaving PostContainerInit=>" + Thread.currentThread());

    }

}
