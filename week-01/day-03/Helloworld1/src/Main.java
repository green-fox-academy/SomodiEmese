import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        /*
            int intnum = 0;
            intnum++;
            intnum += 5;
            double dub = 1.5;
            boolean bool = true;
            String name = "Emese";
            char fistchar = 'c';

            System.out.println("\"Szia\" Emese");
        */

        /*int number = 15;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("I can be devided by 3 and 5");
        } else if (number % 5 == 0){
                System.out.println("I can be devided by 5");
                 } else {
                     System.out.println("blabla");
                 }
       int i = 0;
       while (i < 10){
           System.out.println(" Badboi is awesome");
           i++;
       }
       int a = 0;
        for (int a = 0; a < 10; a++){
            System.out.println("valami");
        }
        int j = 0;
        do {
            System.out.println("Hello");
        }while(j ==5); */

        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a neved");
        String line =  sc.nextLine();
        System.out.println("Hello " + line + "!");
        // int number = sc.nextInt(); -- számot kér be

    }
}