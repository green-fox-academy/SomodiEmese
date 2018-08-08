import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles  {

    public static void mainDraw(Graphics graphics){

        int x = 40;
        int y = 50;
        int a = 60;
        int b = 30;

        for ( int i = 1; i <= 4; i++){
            drawRectangles(graphics, x * i, y * i, a * i, b * i);
        }
    }

    private static void drawRectangles(Graphics graphics, int x, int y, int a, int b) {
        graphics.setColor(new Color( b  , a    , 100  ));
        graphics.drawRect(x ,y, a, b);
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
