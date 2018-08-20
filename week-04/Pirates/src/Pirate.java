import java.util.Random;

public class Pirate {
    int intoxicate = 0;
    boolean deadStatus = false;
    boolean passedOut = false;
    String name = "unknown";

    public Pirate(String name){
        this.name = name;
    }

    public void drinkSomeRum(){
        if (deadStatus){
            System.out.println("He's dead!");
            return;
        }

        if (this.intoxicate > 4 ){
            passedOut = true;
            return;
        }

        this.intoxicate++;
    }

    public void howsItGoingMate(){
        if (deadStatus){
            System.out.println("He's dead!");
            return;
        }

        if(this.passedOut){
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");

        }else {
            System.out.println("Pour me anudder!");
        }
    }

    public void die(){
        deadStatus = true;
    }

    public void brawl(Pirate enemy){
        if (enemy.deadStatus){
            System.out.println("Enemy is already dead");
            return;
        }

        Random rn = new Random();
        int chance = rn.nextInt(3);

        switch(chance){
            case 0: this.die();
                    System.out.println(this.name + " is dead.");
                    break;
            case 1: enemy.die();
                    System.out.println(enemy.name + " is dead.");
                    break;
            default: this.passedOut = true;
                     enemy.passedOut = true;
                     System.out.println("Both passed out");
        }
    }
}
