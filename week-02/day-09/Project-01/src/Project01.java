import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

 public class Project01 {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.green);

        for (int i = 0; i < 16 ; i++){
            int lineGreen = i * 20;
            graphics.drawLine(0,lineGreen,lineGreen, 320);
        }
        graphics.setColor(Color.red);

        for (int i = 0; i < 16; i++){
            int lineRed = 320 - i * 20;
            graphics.drawLine(lineRed, 0,320, lineRed);
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