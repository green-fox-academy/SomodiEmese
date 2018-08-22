package main.java.music;

public class Violin extends StringedInstrument {
    public Violin() {
        super(4, "Screech","Violin");
    }



    @Override
    public void play(){
        super.play();
        System.out.println(strings + "-strings instrument that goes " + sound + ".");
    }
}
