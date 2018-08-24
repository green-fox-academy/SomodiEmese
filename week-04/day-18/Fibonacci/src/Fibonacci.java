import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static int fibonacci(int n) {
        Map<Integer, Integer> results = new HashMap<>();
        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        }
        if (results.get(n) != null) {
            return results.get(n);
        } else {
            int v = fibonacci(n - 1) + fibonacci(n - 2);
            results.put(n, v);
            return v;
        }
    }
}
