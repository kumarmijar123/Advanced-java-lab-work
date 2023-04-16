package LayoutManagement;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
//	JButton btn1,btn2,btn3,btn4;
	
	public GridLayoutDemo() {
		super("GridLayout Frame");
		setSize(300,300);
		setLayout(new GridLayout(3,2,10,10));
//		setLayout(new GridLayout(4,2,10,10));//3 by 2 size of grid
		
		String[] name = {"Button1","Button2","Button3","Button4","Button5"};
		JButton buttons[] = new JButton[name.length];
		
		for(int i=0;i<name.length;i++) {
			buttons[i] = new JButton(name[i]);
		}
		
		for(int i =0; i<name.length;i++) {
			add(buttons[i]);
		}
		
//		btn1 = new JButton("Button 1");
//		btn2 = new JButton("Button 2");
//		btn3 = new JButton("Button 3");
//		btn4 = new JButton("Button 4");
//		
//		
//		add(btn1);
//		add(btn2);
//		add(btn3);
//		add(btn4);
//		add(new JButton("Button 5"));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//terminate background runner
	}

	public static void main(String[] args) {
		new GridLayoutDemo();
	}

}