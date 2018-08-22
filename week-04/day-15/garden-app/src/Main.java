import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        Flower flower01 = new Flower("yellow", 0);
        garden.addFlower(flower01);

        Flower flower02 = new Flower("blue", 0);
        garden.addFlower(flower02);

        Tree tree01 = new Tree("purple", 0);
        garden.addTree(tree01);

        Tree tree02 = new Tree("orange", 0);
        garden.addTree(tree02);

        garden.status();
        garden.wateringWith(40);
        garden.status();
        garden.wateringWith(70);
        garden.status();
    }
}
