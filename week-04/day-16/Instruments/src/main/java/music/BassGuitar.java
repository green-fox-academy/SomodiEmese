package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar() {
        super(4, "Duum-duum-duum", "Bass Guitar");

    }

    @Override
    public void play(){
        super.play();
        System.out.println(strings + "-strings instrument that goes " + sound + ".");
    }
}
