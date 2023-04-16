package PracticalLabSecond;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocusListenerExample implements FocusListener {
   JFrame frame;
   JPanel panel;
   JTextField textField;

   public FocusListenerExample() {
      frame = new JFrame("Focus Listener Example");
      panel = new JPanel();
      textField = new JTextField(20);
      textField.addFocusListener(this);
      panel.add(textField);
      frame.add(panel);
      frame.setSize(400, 400);
      frame.setVisible(true);
   }

   @Override
   public void focusGained(FocusEvent event) {
      System.out.println("Focus gained");
   }

   @Override
   public void focusLost(FocusEvent event) {
      System.out.println("Focus lost");
   }

   public static void main(String[] args) {
      new FocusListenerExample();
   }
}
