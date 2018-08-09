import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3D  {
    public static void mainDraw(Graphics graphics) {
        int distance = 0;
        drawPurpleSquares(graphics, 10, 10 , 20);
        drawPurpleSquares(graphics, 30, 30 , 30);

        for (int i = 1; i <= 6; i++){
            int size = 10 * i;
            drawPurpleSquares(graphics, distance, distance , size);
            distance += size;
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

