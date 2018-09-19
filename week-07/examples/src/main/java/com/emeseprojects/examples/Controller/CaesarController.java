package com.emeseprojects.examples.Controller;

import com.emeseprojects.examples.Services.CaesarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CaesarController {
    CaesarService caesarService;

    public CaesarController(CaesarService caesarService) {
        this.caesarService = caesarService;
    }

}
