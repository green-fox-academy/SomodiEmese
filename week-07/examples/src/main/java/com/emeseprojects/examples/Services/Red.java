package com.emeseprojects.examples.Services;

import org.springframework.stereotype.Service;

@Service
public class Red implements MyColor {
    public void printColor() {
        System.out.println("It is red in color...");
    }
}
