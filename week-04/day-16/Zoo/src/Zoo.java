import main.java.animals.*;
public class Zoo {

        public static void main(String[] args) {

            Reptile reptile = new Reptile("Crocodile", "hen hen");
            Mammal mammal = new Mammal("Koala", "eucalyptus");
            Bird bird = new Bird("Parrot", "seeds");

            System.out.println("How do you breed?");
            System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
            System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
            System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());

            System.out.println("------------------------------------------------");

            System.out.println("What do you eat?");
            System.out.println("A " + reptile.getName() + " is eating " + reptile.eat());
            System.out.println("A " + mammal.getName() + " is eating " + mammal.eat());
            System.out.println("A " + bird.getName() + " is eating " + bird.eat());
        }
    }