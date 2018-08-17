import java.util.ArrayList;
import java.util.List;

public class Animals {
    int hunger;
    int thirst;

    public Animals(){
        this( 50, 50);
    }

    public Animals (int hunger, int thirst ){
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public void eat(){
        this.hunger -= 1;
    }

    public void drink(){
        this.thirst -= 1;
    }

    public void play(){
        this.hunger += 1;
        this.thirst += 1;
    }
    public static void main(String[] args ){
        Animals elephant = new Animals();
        Animals tiger = new Animals();

        List<Animals> animals = new ArrayList<>();

        animals.add(elephant);
        animals.add(tiger);

        elephant.eat();
        System.out.println(elephant.hunger);


    }
}
