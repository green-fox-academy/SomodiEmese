package com.simba.bankofsimba.controller;

import com.simba.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListofBankAccountsController {
    List<BankAccount> list = new ArrayList<>();

    @RequestMapping("/bank")
    public String bankAccount(Model model){
        list.add(new BankAccount("Simba", 2000, "Lion", 2000, false, true));
        list.add(new BankAccount("Timon", 3000, "Meerkat", 3000, false, true));
        list.add(new BankAccount("Pumbaa", 4000, "Warthog", 4000, false, true));
        list.add(new BankAccount("Zazu", 5000, "Red-billed hornbill", 5000, false, true));
        list.add(new BankAccount("Mufasa", 6000, "Lion", 6000, true, false));

        model.addAttribute("accounts", list);

        return "accounts";
    }
}
