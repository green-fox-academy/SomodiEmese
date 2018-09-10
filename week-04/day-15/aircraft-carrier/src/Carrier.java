import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircrafts = new ArrayList<>();
    private int store;
    int healthPoint;

    public Carrier(int store, int healthPoint) {
        this.store = store;
        this.healthPoint = healthPoint;

    }
    public void add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }



    public void fill() throws Exception {
        int storeHelper = store;
        for (Aircraft aircraft : aircrafts) {
            storeHelper -= aircraft.maxAmmo - aircraft.ammo;
        }
        if (storeHelper < 0 ){
            for (Aircraft aircraft : aircrafts) {
                if(store <= 0) {
                    throw new Exception("There is no ammo left");
                }if (aircraft.getType() == "F35"){
                   store = aircraft.refill(store);
                }
            }
            for (Aircraft aircraft : aircrafts) {
                if(store <= 0) {
                    throw new Exception("There is no ammo left");
                }if (aircraft.getType() == "F16") {
                    store = aircraft.refill(store);
                }
            }
        }else {
            for (Aircraft aircraft: aircrafts) {
                store = aircraft.refill(store);
            }
        }
    }

    public void fight(){

    }
}

/*
fight
It should take another carrier as a refrence parameter and fire all the ammo from the aircrafts to it, than substract all the damage from it's health points
getStatus
It should give back a string about it's and all of its aircrafts status like:

HP: 5000, Aircraft count: 4, Ammo Storage: 2300, Total damage: 2280
Aircrafts:
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
If the health points are 0 than it should give back: It's dead Jim :(
 */