package com.epamlearning.eugen.springtutorial.core.it6.springemerged;

public class CustomStringMessageProvider implements MessageProvider {

    private String msg;

    public void setMsg(String message) {
        this.msg = message;
    }


    @Override
    public String getMessage() {
        return msg;
    }
}
