package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;


public class SystemOutMessageSender implements MessageSender {

    @Override
    public void send(String message) {
        Objects.requireNonNull(message);
        System.out.println(message);
    }

//    public void init() {
//        System.out.println("init");
//    }
//
//    @PostConstruct
//    public void postConstruct() {
//        System.out.println("postConstruct");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy");
//    }
//
//    @PreDestroy
//    public void preDestroy() throws Exception {
//        System.out.println("preDestroy");
//    }
//
//    public void exterminate() {
//        System.out.println("exterminate");
//    }

}
