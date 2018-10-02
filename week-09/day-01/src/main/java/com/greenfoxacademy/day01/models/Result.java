package com.greenfoxacademy.day01.models;

public class Result {
    long result;
    String error;

    public Result() {
        this.result = result;
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public static long factorial(long until) {
        if (until <= 1) {
            return 1;
        }else {
            return until * factorial(until - 1);
        }
    }

    public static long sum(long until) {
        long sum = 0;
        for (int i = 1 , j = 1 ; j <= i && i <= until ; i++, j++){
                 sum = sum + j;
            }
        return sum;
    }
}