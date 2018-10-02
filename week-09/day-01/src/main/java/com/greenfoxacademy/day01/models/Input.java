package com.greenfoxacademy.day01.models;

public class Input {

    long received;
    long result;
    String error;

    public Input() {
        this.received = received;
        this.result = result;
        this.error = null;
    }

    public long getReceived() {
        return received;
    }

    public void setReceived(long received) {
        this.received = received;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
