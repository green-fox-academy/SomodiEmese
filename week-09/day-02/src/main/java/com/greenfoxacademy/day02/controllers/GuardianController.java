package com.greenfoxacademy.day02.controllers;

import com.greenfoxacademy.day02.models.Groot;
import com.greenfoxacademy.day02.models.Yondu;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuardianController {

    @GetMapping("/groot")
    @ResponseBody
    public ResponseEntity<Groot> imGroot(@RequestParam ("message") String message){
        Groot groot = new Groot();
        if (message.isEmpty()){
            groot.setError("I'm groot");
            return ResponseEntity.badRequest().body(groot);
        }

        groot.setReceived(message);
        return ResponseEntity.ok().body(groot);
    }

    @GetMapping("/yondu")
    @ResponseBody
    public ResponseEntity<Yondu> arrow( @RequestParam ("distance") Double distance, @RequestParam("time") Double time ){
        Yondu yondu = new Yondu();
        if(time == 0 || distance == null || time == null) {
            return ResponseEntity.badRequest().body(yondu);
        }

        yondu.setSpeed(distance / time);

        return ResponseEntity.ok().body(yondu);
    }

}
