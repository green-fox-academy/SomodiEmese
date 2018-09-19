package com.simba.bankofsimba.models;

public class BankAccount {
    String name;
    int balance;
    String animalType;
    int currency;
    boolean isKing;
    boolean goodOrBad;

    public BankAccount( String name, int balance, String animalType, int currency, boolean isKing, boolean goodOrBad) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.currency = currency;
        this.isKing = isKing;
        this.goodOrBad = goodOrBad;
    }

    public boolean isGoodOrBad() {
        return goodOrBad;
    }

    public void setGoodOrBad(boolean goodOrBad) {
        this.goodOrBad = goodOrBad;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
