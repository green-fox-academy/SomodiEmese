import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args){
        System.out.println("Please,give me two numbers!");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();
        int pigs = scanner.nextInt();
        System.out.println("They have " + ((chicken *2) + (pigs *4)) + " legs in all.");
    }
}
