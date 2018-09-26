package com.greenfoxacademy.polarbearplayground.Controller;

import com.greenfoxacademy.polarbearplayground.Enum.Drinks;
import com.greenfoxacademy.polarbearplayground.Enum.Foods;
import com.greenfoxacademy.polarbearplayground.Models.Bear;
import com.greenfoxacademy.polarbearplayground.Services.BearTaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NutrationStoreController {
    BearTaskService bearTaskService;

    public NutrationStoreController(BearTaskService bearTaskService) {
        this.bearTaskService = bearTaskService;
    }

    @GetMapping("/store")
    public String toStore(Model model, String name){
        Bear bear = bearTaskService.logIn(name);
        model.addAttribute("name", bear.getName());
        model.addAttribute("bear", bear);
        model.addAttribute( "drinks", Drinks.values());
        model.addAttribute("foods", Foods.values());

        return "store";
    }

    @PostMapping("/store")
    public String setNutrations( String name, String drinks, String food ){
        Bear bear = bearTaskService.logIn(name);
        bear.setDrinks( Drinks.valueOf(drinks));
        bear.setFood(Foods.valueOf(food));

        return "redirect:/main?name=" + name;
    }

}
