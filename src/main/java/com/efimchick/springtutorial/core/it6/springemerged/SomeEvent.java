package com.efimchick.springtutorial.core.it6.springemerged;

import org.springframework.context.ApplicationEvent;

public class SomeEvent extends ApplicationEvent {
    public SomeEvent(Object source) {
        super(source);
    }
}
