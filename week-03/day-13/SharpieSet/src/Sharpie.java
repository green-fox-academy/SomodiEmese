import java.util.ArrayList;
import java.util.List;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie( String color, float width, float inkAmount){
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use(){
        this.inkAmount -= 20;
    }

    public static void main(String[] args){
        Sharpie sharpie01 = new Sharpie("Black", 100, 100);
        Sharpie sharpie02 = new Sharpie("Purple", 200, 200);
        Sharpie sharpie03 = new Sharpie("Blue", 300, 0);

        List<Sharpie> sharpies = new ArrayList<>();
        sharpies.add(sharpie01);
        sharpies.add(sharpie02);
        sharpies.add(sharpie03);

        SharpieSet sharpieSet = new SharpieSet(sharpies);
        System.out.println(sharpieSet.countUsuable());

    }
}