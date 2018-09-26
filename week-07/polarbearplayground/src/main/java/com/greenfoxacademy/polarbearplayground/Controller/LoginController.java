package com.greenfoxacademy.polarbearplayground.Controller;

import com.greenfoxacademy.polarbearplayground.Services.BearTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
    BearTaskService bearTaskService;

    public LoginController(BearTaskService bearTaskService) {
        this.bearTaskService = bearTaskService;
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }

   @PostMapping("/login")
    public String getName(@RequestParam ("name") String name){
        if(name.isEmpty()){
            return "login";
        }
        bearTaskService.logIn(name);

        return "redirect:/main?name=" + name;
    }
}

