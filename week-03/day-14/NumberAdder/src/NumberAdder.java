public class NumberAdder {

    public static void main(String[] args) {
        int number = 5;
        int sum = addNumbers(number);
        System.out.println(sum);
    }

    public static int addNumbers(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + addNumbers(n - 1);
        }
    }
}