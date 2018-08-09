import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkboard  {
    public static void mainDraw(Graphics graphics) {

            int x = 0;
            int y = 0;
            for ( int i = 0;  i < 9;  i++ ){
                for ( int j = 0;  j < 8;  j++) {
                    x = j * 22;
                    y = i * 22;
                    if ( (i % 2) == (j % 2) )
                        graphics.setColor(Color.WHITE);
                    else
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect(x, y, 22, 22);
                }
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
