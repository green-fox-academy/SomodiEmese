package com.simba.bankofsimba.controller;

import com.simba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountContorller {
    List<BankAccount> list = new ArrayList<>();

   @RequestMapping("/show")
    public String bankAccount(Model model){

       model.addAttribute("simba", new BankAccount("Simba", 2000, "Lion", 2000, false, false));
       model.addAttribute("zebra", new BankAccount("Zebi", 2000, "Zebra", 2000, false, false));
       model.addAttribute("element", " <em>HTML</em>");
       model.addAttribute("element1", "  <b>Enjoy yourself!</b>");

       return "index";
   }

}
