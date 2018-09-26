package com.greenfoxacademy.polarbearplayground.Services;

import com.greenfoxacademy.polarbearplayground.Models.Bear;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BearTaskService {
    List<Bear> bears = new ArrayList<>();

    private Bear add(String name){
        Bear bear = new Bear(name);
        bears.add(bear);

        return bear;
    }

    public Bear logIn(String name){
        for (Bear bear: bears) {
            if(bear.getName().equals(name)){
                return bear;
            }
        }
        Bear bear = new Bear(name);
        bears.add(bear);

        return bear;
    }

}
