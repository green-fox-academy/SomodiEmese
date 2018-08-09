public class Reverse {
    public static void main(String... args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        reverse(reversed);
    }

    public static void reverse(String reversed) {
        for (int i = reversed.length() - 1; i >= 0; i--) {
            System.out.print(reversed.charAt(i));
        }
    }
}