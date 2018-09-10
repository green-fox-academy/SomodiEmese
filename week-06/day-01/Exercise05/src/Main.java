import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String word = "HeLLoWoRlD";

        String uppers = word.chars()
                .filter(Character::isUpperCase)
                .mapToObj(upperCase -> Character.toString((char)upperCase))
                .collect(Collectors.joining());
        System.out.println(uppers);
    }
}
