import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       List<Fox>foxes = new ArrayList<>();
       Fox fox01 = new Fox("Lumpy", "otocyon", "green");
       Fox fox02 = new Fox("Jake", "pallida", "yellow");
       Fox fox03 = new Fox("IceKing", "alopex", "white");
       Fox fox04 = new Fox("Jake", "canis", "red");
       Fox fox05 = new Fox("Gunther", "pallida", "green");

       foxes.add(fox01);
       foxes.add(fox02);
       foxes.add(fox03);
       foxes.add(fox04);
       foxes.add(fox05);

      List<Fox> findGreenFoxes = foxes.stream()
              .filter(fox -> fox.getColor().equals("green"))
              .collect(Collectors.toList());

        System.out.println(findGreenFoxes.toString());

        List<Fox> findGreenAndPallidaFoxes = foxes.stream()
                .filter(fox -> fox.getColor().equals("green") && "pallida".equals(fox.getType()))
                .collect(Collectors.toList());

        System.out.println(findGreenAndPallidaFoxes.toString());
    }
}
