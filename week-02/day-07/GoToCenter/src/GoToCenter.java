import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        int x = 160;
        int y = 0;
        drawLines(graphics, x, y);
        for ( int i = 0; i < 3; i++){
            graphics.drawLine(x * i , y * i, 160, 171);
        }
    }

    private static void drawLines(Graphics graphics, int x, int y) {
        graphics.setColor(Color.blue);
        graphics.drawLine(x, y, 160, 171);
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