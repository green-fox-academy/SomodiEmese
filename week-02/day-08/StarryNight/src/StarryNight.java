import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight  {

    public static void mainDraw(Graphics graphics) {
        Random r = new Random();
            drawStars(graphics , 200 ,r ) ;
    }

    private static void drawStars(Graphics graphics, int b , Random r) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 320, 343);
        for (int i = 0; i < b; i ++) {
            int color = r.nextInt(204-102) + 102;
                graphics.setColor(new Color(color , color, color));
                graphics.fillOval(  r.nextInt(320),r.nextInt(320) , 5, 5);
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