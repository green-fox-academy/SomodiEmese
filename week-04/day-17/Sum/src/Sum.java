import java.util.ArrayList;
import java.util.List;

public class Sum{
     public int sumNumbers(List<Integer> num) {
         int numbers = 0;
         for (int i = 0; i < num.size(); i++) {
             numbers += num.get(i);
         }return numbers;
     }
}