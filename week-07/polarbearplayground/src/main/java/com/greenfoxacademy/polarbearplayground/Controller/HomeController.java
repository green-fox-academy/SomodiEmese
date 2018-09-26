package com.greenfoxacademy.polarbearplayground.Controller;

import com.greenfoxacademy.polarbearplayground.Models.Bear;
import com.greenfoxacademy.polarbearplayground.Services.BearTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    BearTaskService bearTaskService;

    public HomeController(BearTaskService bearTaskService) {
        this.bearTaskService = bearTaskService;
    }

    @RequestMapping("/main")
    public String playground(@RequestParam("name")String name, Model model){
        Bear bear = bearTaskService.logIn(name);
        model.addAttribute("name", bear.getName());
        model.addAttribute("drink", bear.getDrinks().value());
        model.addAttribute("food",bear.getFood().value());
        model.addAttribute("tricksCount", bear.getTricks().size());
        model.addAttribute("tricks", bear.getTricks());


        return "mainpage";
    }
}
