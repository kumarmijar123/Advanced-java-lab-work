package PracticalLabSecond;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JProgressBarExample implements ActionListener {

    private JFrame frame;
    private JProgressBar progressBar;
    private JButton button;
    private Timer timer;
    private int progressValue;

    public JProgressBarExample() {
        frame = new JFrame("JProgressBar Example");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        progressBar = new JProgressBar(0, 100);
        progressBar.setPreferredSize(new Dimension(200, 20));
        progressBar.setStringPainted(true);
        
        button = new JButton("Start");
        button.addActionListener(this);
        
        frame.add(progressBar);
        frame.add(button);
        frame.pack();
        frame.setVisible(true);
        
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (progressValue < 100) {
                    progressValue++;
                    progressBar.setValue(progressValue);
                } else {
                    timer.stop();
                    button.setText("Complete");
                    button.setEnabled(false);
                }
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            button.setEnabled(false);
            timer.start();
        }
    }

    public static void main(String[] args) {
        new JProgressBarExample();
    }
}

