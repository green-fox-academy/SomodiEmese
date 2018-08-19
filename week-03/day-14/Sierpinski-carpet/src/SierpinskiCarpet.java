import javax.swing.*;
import java.awt.*;

public class SierpinskiCarpet extends JComponent {

    private static int MAX_DEPTH = 0;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x0 = 500;
        int y0 = 500;
        int width = 300;

        Graphics2D graphics = (Graphics2D) g;
        drawSquare(graphics, x0, y0, width, 0);
    }

    private void drawSquare(Graphics2D g, int x0, int y0, int width, int depth) {
        if (depth > 6) {
            return;
        }

        g.fillRect((int)x0 - width / 2, (int)y0 - width / 2, width, width);

        drawSquare(g, x0 + width, y0 + width, width / 3, depth + 1);
        drawSquare(g, x0 + width, y0 - width, width / 3, depth + 1);
        drawSquare(g, x0 - width, y0 + width, width / 3, depth + 1);
        drawSquare(g, x0 - width, y0 - width, width / 3, depth + 1);

        drawSquare(g, x0 + width, y0, width / 3, depth + 1);
        drawSquare(g, x0 - width, y0, width / 3, depth + 1);
        drawSquare(g, x0, y0 + width, width / 3, depth + 1);
        drawSquare(g, x0, y0 - width, width / 3, depth + 1);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("fractal");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        SierpinskiCarpet carpet = new SierpinskiCarpet();
        carpet.setPreferredSize(new Dimension(1000, 1000));

        frame.getContentPane().add(carpet);

        frame.pack();
        frame.setVisible(true);
    }
}