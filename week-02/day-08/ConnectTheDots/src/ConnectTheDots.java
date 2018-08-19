import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots  {
    public static void mainDraw(Graphics graphics) {

        int[]  box = new int[]{10, 10, 290,  10, 290, 290, 10, 290, 10, 10};
        drawBox(graphics, box );

        int[] points = new int[] { 50, 100, 70, 70, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100};
        drawFox( graphics, points);

    }

    private static void drawFox(Graphics graphics, int[] points) {
        for (int i = 0; i <= 12; i+= 2) {
            graphics.setColor(Color.green);
            graphics.drawLine(points[i], points[i+ 1], points[i + 2],points[i + 3]);
        }
    }

    private static void drawBox(Graphics graphics, int[] box) {
        for (int i = 0; i <= 6 ; i+=2) {
            graphics.setColor(Color.green);
            graphics.drawLine(box[i],box[i+ 1],box[i + 2],box[i + 3]);
        }
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

