public class Cuboid {
    public static void main(String[] args){
        double side1 = 6;
        double side2 = 32;
        double side3 = 43;
        double surface = 2*(side1 + side2 + side3);
        double volume = side1 * side2 * side3;
        System.out.println(surface);
        System.out.println(volume);
    }
}
