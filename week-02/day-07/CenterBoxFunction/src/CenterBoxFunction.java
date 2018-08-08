import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {
    public static void mainDraw(Graphics graphics){

        int x = 50;

        for ( int i = 1 ; i < 4; i++)
        drawSquaresCenter (graphics, x+= i );
    }

    private static void drawSquaresCenter (Graphics graphics, int x) {
        graphics.setColor(new Color(100, x, 50));
        graphics.drawRect(115, 120, x, x);
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
