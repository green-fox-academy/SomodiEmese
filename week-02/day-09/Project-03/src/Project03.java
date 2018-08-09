import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

 public class Project03 {
     public static void mainDraw(Graphics graphics) {

         for (int i = 0; i < 32; i++){
             int position = i * 20;

             graphics.drawLine(position,640,320 + position / 2,position);
             graphics.drawLine(640 - position,640,320 - position / 2,position);
             graphics.drawLine(320 - position / 2,position,320 + position / 2, position);
         }
     }

     static int WIDTH = 640;
     static int HEIGHT = 640;

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
