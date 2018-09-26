package com.greenfoxacademy.polarbearplayground.Controller;

import com.greenfoxacademy.polarbearplayground.Enum.Tricks;
import com.greenfoxacademy.polarbearplayground.Models.Bear;
import com.greenfoxacademy.polarbearplayground.Services.BearTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrickCenterContorller {
    BearTaskService bearTaskService;

    public TrickCenterContorller(BearTaskService bearTaskService) {
        this.bearTaskService = bearTaskService;
    }
    @GetMapping("/trickcenter")
    public String goTrickCenter(String name, Model model){
        Bear bear = bearTaskService.logIn(name);
        model.addAttribute("name", bear.getName());
        model.addAttribute("bear", bear);
        model.addAttribute("tricks", Tricks.values());

        return "trickcenter";
    }

    @PostMapping("/trickcenter")
    public String getTricks(String name, String trick){
        Bear bear = bearTaskService.logIn(name);
        bear.setTricks(Tricks.valueOf(trick));

        return "redirect:/main?name=" + name;
    }
}
