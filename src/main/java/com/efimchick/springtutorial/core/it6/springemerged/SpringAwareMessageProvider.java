package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.event.EventListener;

public class SpringAwareMessageProvider implements MessageProvider {
//    private String name;
//    private ApplicationContext applicationContext;

    String msg = "empty";

    @Override
    public String getMessage() {
        return msg;
    }

    @EventListener
    public void listen(SomeEvent someEvent) {
        msg += someEvent.getSource();
    }


//    @Override
//    public void setBeanName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
}
