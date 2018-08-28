public class Sharpie {
    String color;
    int width;
    int inkAmount = 100;

    public Sharpie( String color, int width){
        this.color = color;
        this.width = width;
    }

    public void use(){
        this.inkAmount -= 20;
    }
}