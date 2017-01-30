package com.abh.spring.async;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/applicationContext.xml");
        PostContainerInit post = context.getBean(PostContainerInit.class);
        System.out.println("post=" + post);
    }
}
