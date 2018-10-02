package com.greenfoxacademy.day01.models;

import java.util.stream.IntStream;

public class ArrayResult {
    int[] result;
    String error;

    public ArrayResult() {
        this.result = result;
        this.error = error;
    }

    public int[] getResult() {
        return result;
    }

    public void setResult(int[] result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public static int[] sumArray(int[] array){
        int[] sum = {0};
        sum[0] = IntStream.of(array).sum();

        return sum;
    }

    public static int [] multiplyArray(int[] array){
        int [] multi = {1};
        for (int i = 0; i < array.length; i++)
            multi[0] = multi[0] * array[i];

        return multi;
    }

    public static int[] doubleArray (int[] array) {
        int newArray[] = new int[array.length];
        for( int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;
    }
}
