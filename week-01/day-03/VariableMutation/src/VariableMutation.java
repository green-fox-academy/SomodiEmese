public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(a + 10);

        int b = 100;
        System.out.println(b - 7);

        int c = 44;
        System.out.println(c * 2);

        int d = 125;
        System.out.println(d / 5);

        int e = 8;
       double cube = Math.pow(e, 3);
        System.out.println(cube);

        int f1 = 123;
        int f2 = 345;
        boolean f3 = f1 > f2;
        System.out.println(f3);

        int g1 = 350;
        int g2 = 200;
        boolean g3 = (g2* 2) > g1;
        System.out.println(g3);

        int h1 = 135798745;
        boolean h2 = (h1 / 11) == 0;
        System.out.println(h2);

        int i1 = 10;
        int i2 = 3;
        boolean i3 = (i1*i1) > i2 && i1 < i2 * i2 * i2;
        System.out.println(i3);

        int j1 = 1521;
        boolean j2 = (j1 / 3) == 0 || (j1 / 5) == 0;
        System.out.println(j2);

        String k = "Apple";
        System.out.println(k + k + k + k + k);


    }
}
