package com.greenfoxacademy.polarbearplayground.Enum;

public enum Drinks {
    cola ("cola"),
    lemonade ("lemonade"),
    tea ("tea"),
    beer ("beer"),
    juice ("bear juice");

    private String value;

    Drinks(String value) {
        this.value = value;
    }

    public String value(){
        return this.value;
    }
}
