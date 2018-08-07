import java.util.ArrayList;

public class Candyshop {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));

    }

    public static Object sweets(ArrayList<Object> arrayList){
        arrayList.remove(1);
        arrayList.add(1, "Croissant");
        arrayList.remove(3);
        arrayList.add(3, "Ice cream");

        return arrayList;
    }
}
