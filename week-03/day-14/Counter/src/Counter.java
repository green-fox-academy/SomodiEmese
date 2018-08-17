public class Counter {

    public static int countdown(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return countdown(n - 1);
        }
    }

    public static void main(String[] args){
        countdown(10);
    }
}
