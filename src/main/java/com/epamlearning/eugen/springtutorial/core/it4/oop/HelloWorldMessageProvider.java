package com.epamlearning.eugen.springtutorial.core.it4.oop;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
