package com.greenfoxacademy.polarbearplayground.Models;

import com.greenfoxacademy.polarbearplayground.Enum.Drinks;
import com.greenfoxacademy.polarbearplayground.Enum.Foods;
import com.greenfoxacademy.polarbearplayground.Enum.Tricks;

import java.util.ArrayList;
import java.util.List;

public class Bear {
    private String name;
    private Drinks drinks;
    private Foods food;
    private Tricks trick;
    private List<Tricks> tricks;

    public Bear(String name) {
        this.name = name;
        this.food = Foods.pizza;
        this.drinks = Drinks.cola;
        this.trick = trick;
        this.tricks = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drink) {
        this.drinks = drink;
    }

    public Foods getFood() {
        return food;
    }

    public void setFood(Foods food) {
        this.food = food;
    }

    public List<Tricks> getTricks() {
        return tricks;
    }

    public void setTricks(Tricks trick) {
        this.tricks.add(trick);
    }

    public Tricks getTrick() {
        return trick;
    }
}
