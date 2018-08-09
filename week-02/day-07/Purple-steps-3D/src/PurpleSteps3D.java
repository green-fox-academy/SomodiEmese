import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D  {
    public static void mainDraw(Graphics graphics) {

        int x = 10;
        int y = 10;
        int a = 10;
        for ( int i =0; i < 5; i++ ) {
                drawPurpleSquares(graphics, x*i + 2* 10 * i, y* i + 2* 10 * i  , a * i);
            }
    }

    private static void drawPurpleSquares(Graphics graphics, int x, int y, int a ) {
        graphics.setColor(Color.magenta);
        graphics.fillRect( x, y, a, a);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x, y, a, a);

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

