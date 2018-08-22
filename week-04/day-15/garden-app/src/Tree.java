public class Tree extends Plants{
    public Tree(String color, double waterAmount) {
        super(color, waterAmount, 0.4);
    }

    public void needsStatus() {
        if (needs()) {
            System.out.println("The " + color + " Tree needs water.");
        } else {
            System.out.println("The " + color + " Tree doesn't need water");
        }
    }

    public boolean needs(){
        if (waterAmount < 10){
            return true;
        } else {
            return false;
        }
    }
}
