package PracticalLabSecond;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseAdapterExample extends MouseAdapter {
   JFrame frame;
   JPanel panel;

   public MouseAdapterExample() {
      frame = new JFrame("Mouse Adapter Example");
      panel = new JPanel();
      panel.addMouseListener(this);
      frame.add(panel);
      frame.setSize(400, 400);
      frame.setVisible(true);
   }

   @Override
   public void mouseClicked(MouseEvent event) {
      int x = event.getX();
      int y = event.getY();
      System.out.println("Mouse clicked at (" + x + ", " + y + ")");
   }

   @Override
   public void mousePressed(MouseEvent event) {
      int x = event.getX();
      int y = event.getY();
      System.out.println("Mouse pressed at (" + x + ", " + y + ")");
   }

   @Override
   public void mouseReleased(MouseEvent event) {
      int x = event.getX();
      int y = event.getY();
      System.out.println("Mouse released at (" + x + ", " + y + ")");
   }

   public static void main(String[] args) {
      new MouseAdapterExample();
   }
}
