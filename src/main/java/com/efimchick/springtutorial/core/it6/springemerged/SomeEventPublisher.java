package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class SomeEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;
    private int c = 0;

    @Override

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void generateEvent() {
        applicationEventPublisher.publishEvent(new SomeEvent(c++));
    }
}
