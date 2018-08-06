public class Factorio {
    public static void main(String[] args){
        int a = 5;
        System.out.println(factorio(a));
    }
    public static int factorio (int a){
        int b= 1;
        for( int i = 1; i <= a ; i++){
            b *= i;
        }
        return b;
    }
}
