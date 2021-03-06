package com.greenfoxacademy.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloUserRestContorller {
    AtomicLong atomicLong = new AtomicLong(1);

    @RequestMapping("/greeting3")
    public Greeting greeting(@RequestParam ("name") String name){
               return new Greeting(atomicLong.incrementAndGet(), "Hello " + name);
        }
}