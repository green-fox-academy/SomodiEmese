package com.greenfoxacademy.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong atomicLong = new AtomicLong(0);

    @RequestMapping("/web/greeting5")
    public String greeting(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", " Emese");
        model.addAttribute("atomicLong", atomicLong.incrementAndGet() );
        return "greeting";
    }
}
