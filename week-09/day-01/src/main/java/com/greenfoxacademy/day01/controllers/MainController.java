package com.greenfoxacademy.day01.controllers;

import com.greenfoxacademy.day01.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MainController {

    @RequestMapping("/")
    public String frondent() {

        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public Input doubling(@RequestParam("input") long received) {
        Input input = new Input();
        /*if (received == null) {
            input.setError("Please provide an input!");
            return input;
        } */

        input.setReceived(received);
        input.setResult(received * 2);

        return input;
    }

    @GetMapping("/greeter")
    @ResponseBody
    public Greet greeter (@RequestParam("name") String name, @RequestParam("title") String title) {
        Greet greet = new Greet();
        if (name.isEmpty()) {
            greet.setError("Please provide a name!");
            return greet;
        } else if (title.isEmpty()) {
            greet.setError("Please provide a title!");
            return greet;
        } else {
            greet.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
            return greet;
        }
    }

    @GetMapping("/append/{appendable}")
    @ResponseBody
    public Append append(@PathVariable String appendable){
        Append append = new Append();
        if(appendable.isEmpty()){
            append.setError("Please provide a word");
        }
        append.setAppended(appendable + "a");


        return append;
    }

    @PostMapping("/dountil/{action}")
    @ResponseBody
    public Result dountil(@PathVariable String action, @RequestBody Until until ) {
        Result result = new Result();
        if (action.equals ("factor")) {
            result.setResult(result.factorial(until.getUntil()));
            return result;
        } else if (action.equals("sum")) {
            result.setResult(result.sum(until.getUntil()));
            return result;
        } else if (until.getUntil() == 0) {
            result.setError(" Please provide a number!");
        }else if (action.isEmpty()) {
            result.setError("Please provide an action");
            return result;
        }
        return result;
    }

    @PostMapping("/arrays")
    @ResponseBody
    public ArrayResult arrayResult(@RequestBody Array array){
        ArrayResult result = new ArrayResult();
        if(array.getWhat().equals("sum")){
            result.setResult(result.sumArray(array.getNumbers()));
            return result;
        }else if(array.getWhat().equals("multiply")){
            result.setResult(result.multiplyArray(array.getNumbers()));
            return result;
        }else if(array.getWhat().equals("double")){
            result.setResult(result.doubleArray(array.getNumbers()));
            return result;
        }else if (array.getWhat().isEmpty()){
            result.setError("Please provide what to do with the numbers!");
            return result;
        }

        return result;
    }
}

