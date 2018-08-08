import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 50;
        drawHorizontalLines(graphics, x, y);
        for (int i = 0; i < 2; i++){
            drawHorizontalLines(graphics, x * i + 20  , y );
        }
    }

    private static void drawHorizontalLines(Graphics graphics, int x, int y) {
        graphics.setColor(Color.green);
        graphics.drawLine(x, y, x, 100);
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