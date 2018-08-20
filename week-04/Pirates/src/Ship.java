import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> crew = new ArrayList<>();
    Pirate captain;
    String name;

    public Ship (String name){
        this.name = name;
    }

    public void fillShip() {
        Random rn = new Random();
        int crewSize = 1 + rn.nextInt(5);
        this.captain = new Pirate("Captain");

        for (int i = 0; i < crewSize; i++) {
            Pirate pirate = new Pirate("Pirate " + i);
            this.crew.add(pirate);
        }
    }

    public int activePirates() {
        int active = 0;

        for (int i = 0; i < crew.size(); i++) {
            if (!crew.get(i).deadStatus && !crew.get(i).passedOut) {
                active++;
            }
        }

        return active;
    }

    public void status() {
        System.out.println("-------------------------------------------");
        if (captain.deadStatus || captain.passedOut) {
            System.out.println("Captain is dead or passed out. ");
        } else {
            System.out.println("Captain is alive!");
            System.out.println("Captain consumed " + captain.intoxicate + " rum(s)");
        }
        System.out.println("There is/are " + this.activePirates() + " pirate(s) alive");
        System.out.println("-------------------------------------------");
    }

    public boolean battle(Ship otherShip) {
        int score = this.activePirates() + this.captain.intoxicate;
        int enemyScore = otherShip.activePirates() + otherShip.captain.intoxicate;

        if (score > enemyScore) {
            victory(this);
            return true;
        } else {
            victory(otherShip);
            return false;
        }
    }

    private void victory(Ship ship) {
        Random rn = new Random();
        int loss = rn.nextInt(ship.activePirates());

        for (int i = 0; i < loss; i++) {
            ship.crew.remove(0);
        }

        for (int i = 0; i < ship.crew.size(); i++){
            if (rn.nextBoolean()){
                ship.crew.get(i).drinkSomeRum();
            }
        }

        if (rn.nextBoolean()){
            ship.captain.drinkSomeRum();
        }
        System.out.println(ship.name + " has won");
    }


}
