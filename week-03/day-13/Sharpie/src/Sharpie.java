public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

    public Sharpie( String color, float width){
        this.color = color;
        this.width = width;
    }

    public void use(){
        this.inkAmount -= 20;
    }

    public static void main(String[] args){
        Sharpie sharpie01 = new Sharpie("Black", 100);
        Sharpie sharpie02 = new Sharpie("Purple", 200);

        sharpie01.use();
        System.out.println(sharpie01.inkAmount);
    }
}
