import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me a number as a km");
        int distance = scanner.nextInt();

        System.out.println("Your number in miles is: " + distance * 1.609344  );

    }
}
