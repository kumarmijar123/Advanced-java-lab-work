package LayoutManagement;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JPanel {
	private static final String GridGagConstraints = null;
	JButton b1, b2, b3, b4, b5;
	GridBagConstraints gbc;
	
	public GridBagLayoutDemo() {
		setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		b1 = new JButton("Button1");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 5;
		gbc.fill=GridBagConstraints.VERTICAL;
		add(b1,gbc);//button1 is added to JFrame in 0, 0 position
		b2 = new JButton("Button2");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		add(b2, gbc);// button2 is added to JFrame in 1, 1 position
		b3 = new JButton("Button3");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		add(b3, gbc);// button2 is added to JFrame in 2, 2 position
		b4 = new JButton("Button4");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		add(b4, gbc);// button2 is added to JFrame in 3, 3 position
		b5 = new JButton("Button5");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(b5, gbc);// button2 is added to JFrame in 4, 4 position
	}

	public static void main(String[] args) {
		GridBagLayoutDemo panel = new GridBagLayoutDemo();
		panel.setBackground(Color.GREEN);
		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
