package LayoutManagement;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//BorderLayout is default for JFrame
public class BorderLayoutDemo extends JFrame{
//	JButton btn1,btn2,btn3,btn4;
	JButton buttons[];
	
	public BorderLayoutDemo() {
		super("Border Layout Frame");
		
		String[] name = {"Button1","Button2","Button3","Button4","Button5"};
		buttons = new JButton[name.length];
		for(int i=0;i<name.length;i++) {
			buttons[i] = new JButton(name[i]);
		}
		
//		btn1 = new JButton("Button 1");
//		btn2 = new JButton("Button 2");
//		btn3 = new JButton("Button 3");
//		btn4 = new JButton("Button 4");
		
		setLayout(new BorderLayout(10,10));//hgap,vgap
		
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);
		
//		add(new JButton("Button 5"), BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//terminate background runner
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}

}
