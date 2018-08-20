public class WarApp {
    public static void main(String[] args) {

        Armada armada01 = new Armada("Blue Armada");
        Armada armada02 = new Armada("Red Armada");

        armada01.fillArmada("Black Pearl");
        armada02.fillArmada("T-tanic");

        armada01.war(armada02);
    }
}
