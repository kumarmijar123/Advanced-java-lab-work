import AdvancedSwingComponent.TableTreeProgressBar;


import java.awt.*;
import javax.swing.*;

public class AwtVsSwingExample {

    public static void main(String[] args) {

        // create a frame using AWT
        Frame awtFrame = new Frame("AWT Frame");
        awtFrame.add(new Label("This is an AWT Frame"));
        awtFrame.setSize(300, 200);
        awtFrame.setVisible(true);

        // create a frame using Swing
        JFrame swingFrame = new JFrame("Swing Frame");
        swingFrame.add(new JLabel("This is a Swing Frame"));
        swingFrame.setSize(300, 200);
        swingFrame.setVisible(true);
        
        TableTreeProgressBar tabletree = new TableTreeProgressBar();
        tabletree.print();

    }
}
