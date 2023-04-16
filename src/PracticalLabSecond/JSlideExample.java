package PracticalLabSecond;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JSlideExample implements ChangeListener {

    private JFrame frame;
    private JSlider slider;
    private JLabel label;

    public JSlideExample() {
        frame = new JFrame("JSlider Example");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        
        label = new JLabel("Current value: " + slider.getValue());
        
        frame.add(slider);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider) e.getSource();
        if (!source.getValueIsAdjusting()) {
            int value = source.getValue();
            label.setText("Current value: " + value);
        }
    }

    public static void main(String[] args) {
        new JSlideExample();
    }
}

