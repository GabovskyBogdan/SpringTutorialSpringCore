package com.epamlearning.eugen.springtutorial.core.it5.configurablefactory;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
