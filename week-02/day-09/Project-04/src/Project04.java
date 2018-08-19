import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Project04 {

    public static void mainDraw(Graphics graphics) {
        int[] x = new int[]{120, 126, 134, 140, 134, 126};
        int[] y = new int[]{112, 104, 104, 112, 120, 120};
        int n = 6;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                y[j] += 16;
            }
            graphics.drawPolygon(x, y, n);
        }
      /* int[] a = new int[]{120, 126, 134, 140, 134, 126};
        int[] b = new int[]{112, 104, 104, 112, 120, 120};
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                b[j] += 16;
            }
            graphics.drawPolygon(a, b, n);
        }*/
    }

    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}