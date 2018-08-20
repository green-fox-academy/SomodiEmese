import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
    List<Ship> armada = new ArrayList<>();
    String name;

    public Armada(String name){
       this.name = name;
    }

    public boolean war( Armada otherArmada){
        do{
           boolean winner = this.armada.get(0).battle(otherArmada.armada.get(0));
           if( winner){
               otherArmada.armada.remove(0);
           }else{
               this.armada.remove(0);
           }
        }while (this.armada.size() > 0 && otherArmada.armada.size() > 0);

        if (this.armada.size() > otherArmada.armada.size()){
            System.out.println(this.name +  " has won");
            return true;
        }else {
            System.out.println(otherArmada.name + " has won.");
            return false;
        }
    }

    public void fillArmada(String shipName) {
        Random rn = new Random();
        int armadaSize = 5 + rn.nextInt(6);

        for (int i = 0; i < armadaSize; i++ ){
            Ship ship = new Ship(shipName + " " + i);
            ship.fillShip();
            armada.add(ship);

        }
    }
}
