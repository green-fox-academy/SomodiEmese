public class Flower extends Plants {
    public Flower(String color, double waterAmount) {
        super(color, waterAmount, 0.75);
    }

    public void needsStatus() {
        if (needs()) {
            System.out.println("The " + color + " Flower needs water.");
        } else {
            System.out.println("The " + color + " Flower doesn't need water");
        }
    }

    public boolean needs(){
        if (waterAmount < 5){
            return true;
        } else {
            return false;
        }
    }
}
