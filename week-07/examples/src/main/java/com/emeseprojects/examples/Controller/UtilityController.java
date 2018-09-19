package com.emeseprojects.examples.Controller;

import com.emeseprojects.examples.Services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UtilityController {
    private UtilityService utilityService;

    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    public String page(Model model){

       return "index";
    }

    @RequestMapping("useful/colored")
    public String randomBackground(Model model){
        model.addAttribute("color", utilityService.randomColor());
        return "color";
    }

    @RequestMapping("useful/email")
    public String validEmail(@RequestParam("email") String text , Model model){
        model.addAttribute("email", utilityService.validateEmail(text));
        model.addAttribute("text", text);

        return "email";
    }
}
