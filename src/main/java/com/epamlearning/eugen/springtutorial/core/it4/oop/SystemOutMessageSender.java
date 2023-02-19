package com.epamlearning.eugen.springtutorial.core.it4.oop;

import java.util.Objects;

public class SystemOutMessageSender implements MessageSender {
    @Override
    public void send(String message) {
        Objects.requireNonNull(message);
        System.out.println(message);
    }
}
