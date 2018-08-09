import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        int[][] size = new int[4][4];
        for (int i = 0; i < size; i++){
            for (int j= 0; j < size; j++){
                if ( j > 0 && j < size - 1 && i > 0 && i < size -1 && i!= j){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}