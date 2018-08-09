import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter  {

    public static void mainDraw(Graphics graphics) {

        int x = 0;
        int y = 0;
        for (int i = 0; i <= 320; i += 20) {
            for (int j = 0; j <= 343; j+= 20) {
                drawLines(graphics, x + i, y );
                drawLines(graphics, x , y + j);
            }
        }
        for (int i = 320; i >= 0; i -= 20) {
            for (int j = 343; j >= 0; j -= 20) {
                drawLines(graphics, x = 320, y = j );
                drawLines(graphics, x = i, y = 343 );
            }
        }
    }
    private static void drawLines(Graphics graphics, int x, int y) {
        graphics.setColor(Color.BLUE);
        graphics.drawLine(x, y ,160, 171);
    }

    // Don't touch the code below
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