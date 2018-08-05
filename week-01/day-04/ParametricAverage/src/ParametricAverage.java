import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double yourNumber = scanner.nextInt();
        double sum = 0;

        for(int i = 0; i < yourNumber; i++){
            sum += scanner.nextInt();
        }
            System.out.println((int)sum);
            System.out.println(sum / yourNumber);

    }
}
