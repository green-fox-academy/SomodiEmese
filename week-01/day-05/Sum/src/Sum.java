public class Sum {
    public static void main(String[] args){
        int a = 3;
        System.out.println(sum(a));
    }
    public static int sum(int a ){
        int b = 0;
        for ( int i = 0; i <= a; i++ ) {
            b += i;
        }
        return b;
    }
}
