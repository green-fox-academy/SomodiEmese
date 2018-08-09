import java.util.*;

public class ElementFinder {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        System.out.println(containsSeven2(arrayList));
    }

    public static String containsSeven(ArrayList<Integer> arrayList) {
        if (arrayList.contains(7)) {
            return "Hooray";
        } else {
            return "Nooooo";
        }
    }

    public static String containsSeven2 (ArrayList<Integer> arrayList){
        if (arrayList.indexOf(7) != -1) {
            return "Hooray";
        } else {
            return "Nooooo";
        }
    }
}
