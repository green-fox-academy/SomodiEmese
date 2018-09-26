package com.greenfoxacademy.polarbearplayground.Enum;

public enum Foods {
    pizza("pizza"),
    donut("donut"),
    lasagna("lasagna"),
    sushi("sushi"),
    chocolate("chocolate");

    private String value;

    Foods(String value) {
        this.value = value;
    }

    public String value(){
        return this.value;
    }
}
