import main.java.music.*;

public class AppMusic {


    public static void main(String[] args) {

        ElectricGuitar guitar = new ElectricGuitar();
        BassGuitar bassGuitar = new BassGuitar();
        Violin violin = new Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        ElectricGuitar guitar2 = new ElectricGuitar();
        BassGuitar bassGuitar2 = new BassGuitar();
        Ting ting1 = new Ting();

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
        ting1.play();
    }

}