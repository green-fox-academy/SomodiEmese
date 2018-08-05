import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        int myNumber = 5;
        int yourNumber;
        do {
            System.out.println("Please guess a number!");
             yourNumber = scanner.nextInt();
            if (yourNumber > myNumber) {
                System.out.println("The stored number is higher");
            } else if (yourNumber < myNumber) {
                System.out.println("The stried number is lower");
            }
        }while (  myNumber != yourNumber);
        System.out.println("You found the number: " + yourNumber);



    }
}
