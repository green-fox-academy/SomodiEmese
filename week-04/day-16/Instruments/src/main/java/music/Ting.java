package main.java.music;

public class Ting extends StringedInstrument {

    public Ting() {
        super(1, "SKRRRRRRRA", "Ting");
    }

    @Override
    public void play(){
        System.out.print("The " + name + " goes " + sound + ".");
        System.out.println(" Papakakaka");
    }
}
