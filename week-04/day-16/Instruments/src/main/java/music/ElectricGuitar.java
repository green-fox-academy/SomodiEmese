package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        super(6, "Twang", "Electric Guitar");
    }

    @Override
    public void play(){
        super.play();
        System.out.println(strings + "-strings instrument that goes " + sound + ".");
    }
}
