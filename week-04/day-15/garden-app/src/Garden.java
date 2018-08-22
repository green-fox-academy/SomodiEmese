import java.util.ArrayList;
import java.util.List;

public class Garden {

    private ArrayList<Flower> flowers = new ArrayList<>();
    private ArrayList<Tree> trees = new ArrayList<>();

    public void addFlower (Flower flower){
        flowers.add(flower);
    }

    public void addTree (Tree tree){
        trees.add(tree);
    }


    public void wateringWith(int amount){
        System.out.println("Watering with " + amount);

        List<Plants> needWater = new ArrayList<>();

        for (Flower flower : flowers) {
            if (flower.needs()) {
                needWater.add(flower);
            }
        }

        for (Tree tree : trees) {
            if (tree.needs()) {
                needWater.add(tree);
            }
        }

        double waterPerPlant = amount / needWater.size();

        for (Plants plant : needWater) {
            plant.watering(waterPerPlant);
        }
    }

    public void status() {
        for (Flower flower : flowers) {
            flower.needsStatus();
        }

        for (Tree tree : trees) {
            tree.needsStatus();
        }
    }
}
