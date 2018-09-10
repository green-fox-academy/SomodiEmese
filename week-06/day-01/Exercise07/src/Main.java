import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String word = "asdasdfgasd";

        Map<Character, Integer> frequency = word
                .chars()
                .mapToObj(letter -> (char)letter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(letter -> 1)));
        System.out.println(frequency);
    }
}