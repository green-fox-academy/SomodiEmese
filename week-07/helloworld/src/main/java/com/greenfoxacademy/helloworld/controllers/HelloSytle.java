package com.greenfoxacademy.helloworld.controllers;

import java.awt.*;
import java.util.Random;

public class HelloSytle {


    public Color randomColor() {
        Random randomGenerator = new Random();
        Integer red = randomGenerator.nextInt(256);
        Integer green = randomGenerator.nextInt(256);
        Integer blue = randomGenerator.nextInt(256);

        return new Color(red, green, blue);
    }

    public Font randomSize () {
        int z = (int)(Math.random() * 300 - 0);
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        int index = (int)(Math.random() * (fontNames.length - 1));
        String fontName = fontNames[index];

        return new Font(fontName, Font.PLAIN, z);
    }
}
