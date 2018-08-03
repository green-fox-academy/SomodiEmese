public class FizzBuzz {
    public static void main(String[] args) {

        int a = 0;
        while (a <= 100) {
            System.out.println(a);
            a++;
            if (a % 3 == 0 && a % 5 ==0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 ==0 ){
                System.out.println("Fizz");
            }
        }
    }
}
