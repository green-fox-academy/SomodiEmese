import java.util.Scanner;

public class MultiplicationTable{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please give me a number");
            int a = scanner.nextInt();

            for (int i = 0; i <= 10 ; i++) {
                System.out.println(i + "*" + a + "=" + i * a);
            }
    }
}
