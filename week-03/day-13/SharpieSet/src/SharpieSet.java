import java.util.List;

public class SharpieSet {
    private static List<Sharpie> sharpies;

    public SharpieSet( List<Sharpie> sharpies){
        this.sharpies = sharpies;
    }

    public int countUsuable() {
        int sum = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                sum++;

            }
        } return sum;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount <= 0) {
                sharpies.remove(i);
                i = 0;
            }
        }
    }

    public static void main(String[] args){
        SharpieSet sharpieSet = new SharpieSet(sharpies);
    }
}