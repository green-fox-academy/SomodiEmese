package com.greenfoxacademy.day01.controllers;

import com.greenfoxacademy.day01.models.*;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainControllerTest {

    @Test
    public void frontendTest() {
        MainController controller = new MainController();
        String result = controller.frondent();

        assertEquals("index", result);
    }

    @Test
    public void doublingTest(){
        MainController controller = new MainController();
        Input input = controller.doubling(5);

        assertEquals(10, input.getResult() );

    }
    @Test
    public void greetTest_missingName() {

        MainController controller = new MainController();
        Greet greet = controller.greeter("", "title");

        assertEquals("Please provide a name!", greet.getError());
    }

    @Test
    public void greetTest_missingTitle() {

        MainController controller = new MainController();
        Greet greet = controller.greeter("name", "");

        assertEquals("Please provide a title!", greet.getError());
    }

    @Test
    public void greetTest_isOk() {

        MainController controller = new MainController();
        Greet greet = controller.greeter("name", "title");

        assertEquals("Oh, hi there name, my dear title!", greet.getWelcomeMessage());
    }

    @Test
    public void appendableTest_isBad(){
        MainController controller = new MainController();
        Append append = controller.append("");

        assertEquals("Please provide a word", append.getError());
    }

    @Test
    public void appendableTest_isOk(){
        MainController controller = new MainController();
        Append append = controller.append("kuty");

        assertEquals("kutya", append.getAppended());
    }

    @Test
    public void doUntilTest_isSum(){
        MainController controller = new MainController();
        Until until = new Until();
        until.setUntil(5);
        Result result = controller.dountil("sum", until);

        assertEquals(15, result.getResult());
    }

    @Test
    public void doUntilTest_isFactor(){
        MainController controller = new MainController();
        Until until = new Until();
        until.setUntil(5);
        Result result = controller.dountil("factor", until);

        assertEquals(120, result.getResult());
    }

    @Test
    public void doUntilTest_isBad(){
        MainController controller = new MainController();
        Until until = new Until();
        until.setUntil(5);
        Result result = controller.dountil("", until);

        assertEquals("Please provide an action", result.getError());
    }

}