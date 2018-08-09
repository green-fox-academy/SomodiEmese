import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static List<String> makingMatches(ArrayList<String> girls , ArrayList<String> boys) {
        int girlsSize = girls.size();
        int boysSize = boys.size();
        ArrayList<String> match = new ArrayList<String>();

        for (int i = 0; i < girlsSize; i++) {
            if (boysSize > i) {
                match.add(i * 2 , girls.get(i));
                match.add(i * 2 + 1, boys.get(i));
            }
        }
        return match;
    }
}
