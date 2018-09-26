package com.greenfoxacademy.polarbearplayground.Enum;

public enum Tricks {
    play("Play with his seal"),
    code ("Code in JAVA"),
    game("Play Rocket Leauge on Computer");

    private String value;

    Tricks(String value) {
        this.value = value;
    }

    public String value(){
        return this.value;
    }
}
