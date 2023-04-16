package PracticalLabSecond;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyEventExample implements KeyListener {
   JTextArea textArea;

   public KeyEventExample() {
      JFrame frame = new JFrame("Key Event Example");
      textArea = new JTextArea();
      textArea.addKeyListener(this);
      frame.add(textArea);
      frame.setSize(400, 400);
      frame.setVisible(true);
   }

   @Override
   public void keyPressed(KeyEvent event) {
      textArea.append("Key Pressed: " + event.getKeyChar() + "\n");
   }

   @Override
   public void keyReleased(KeyEvent event) {
      textArea.append("Key Released: " + event.getKeyChar() + "\n");
   }

   @Override
   public void keyTyped(KeyEvent event) {
      textArea.append("Key Typed: " + event.getKeyChar() + "\n");
   }

   public static void main(String[] args) {
      new KeyEventExample();
   }
}
