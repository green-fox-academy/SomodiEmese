import java.util.List;

public class Farm {
    int slots = 5;
    private static List<Animals> animals;

    public Farm(List<Animals> animals) {
        this.animals = animals;
    }

    public void breed() {

        if (slots > animals.size()) {
            animals.add(new Animals());
        }
    }

    public void slaughter() {
        int leastHungry = 50;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger < leastHungry) {
                animals.get(i).hunger = leastHungry;
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).hunger == leastHungry) {
                animals.remove(i);
            }
        }
    }
}