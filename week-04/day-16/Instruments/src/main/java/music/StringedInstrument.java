package main.java.music;

abstract class StringedInstrument extends Instrument {
    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    int strings;
    String sound;

    public StringedInstrument(int strings, String sound, String name) {
        this.strings = strings;
        this.sound = sound;
        this.name = name;
    }

    public int numberOfStrings(int strings) {
        return strings;
    }

    public String sound(String sound) {
        return sound;
    }

    @Override
    public void play() {
        System.out.print(name + ", a ");

    }
}