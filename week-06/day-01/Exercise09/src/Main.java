import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Character[] array = {'h', 'e', 'l', 'l', 'o'};
        String charToString = Arrays.stream(array)
                .map(word -> word.toString())
                .collect(Collectors.joining());

        System.out.println(charToString);

    }
}
