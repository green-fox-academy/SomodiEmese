import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Please, give me two numbers!");
        int girls = scanner.nextInt();
        int boys = scanner.nextInt();

        if ( girls == boys && girls + boys > 20){
            System.out.println("The party is excellent!");
        } else if (girls != boys && girls + boys > 20){
            System.out.println("Quite cool party!");
        } else if (girls + boys < 20 && girls > 0){
            System.out.println("Average party...");
        } else if (girls == 0 ){
            System.out.println("Sausage party");
        } else {
            System.out.println();
        }
    }
}
