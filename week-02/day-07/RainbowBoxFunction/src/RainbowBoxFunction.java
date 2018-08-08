import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        int a = 100;
        Color[] color = new Color[]{Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,Color.BLUE,Color.MAGENTA, Color.PINK};
        for ( int i = 0 ; i < color.length -1; i++)
        rainbowSquares(graphics, color[i], a + i * 10 );

    }

    private static void rainbowSquares(Graphics graphics,Color color, int a) {
        graphics.setColor(color);
        graphics.drawRect(75,75, a, a);
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