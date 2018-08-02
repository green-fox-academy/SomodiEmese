import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, give me 5 numbers!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
      System.out.println("Average: " + (a + b + c + d + e)/ 5 + ".");
      System.out.println("Sum: " + (a + b + c + d + e) + ".");

    }
}
