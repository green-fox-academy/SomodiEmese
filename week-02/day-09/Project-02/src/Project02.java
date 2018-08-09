import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Project02 {
    public static void mainDraw(Graphics graphics) {

         for (int i = 0; i < 16 ; i++){

            int position = i * 10;
            graphics.setColor(Color.red);
            graphics.drawLine(160,position,160 - position , 160);

            graphics.setColor(Color.green);
            graphics.drawLine(160, position, 160 + position,  160);

            graphics.setColor(Color.orange);
            graphics.drawLine(160,320 - position,160 - position , 160);

            graphics.setColor(Color.blue);
            graphics.drawLine(160,320 - position,160 + position , 160);
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
