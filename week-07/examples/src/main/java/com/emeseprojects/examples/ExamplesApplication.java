package com.emeseprojects.examples;

import com.emeseprojects.examples.Services.MyColor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamplesApplication { //implements CommandLineRunner //

    /*MyColor myColor;

    public ExamplesApplication(MyColor myColor) {
        this.myColor = myColor;
    }
*/

    public static void main(String[] args) {
        SpringApplication.run(ExamplesApplication.class, args);

    }
/*
    @Override
    public void run(String... args) throws Exception {
        myColor.printColor();
    }*/
}
