
package LayoutManagement;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo  extends JFrame{
	JButton btn1,btn2,btn3,btn4;
	
	public FlowLayoutDemo() {
		super("FlowLayout Frame");//calls constructor of JFrame //setTitle
		setSize(300,300);
//		FlowLayoutDemo layout = new FlowLayout();
//		setLayout(new FlowLayout(FlowLayout.LEFT));//left alignment
		setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));//right alignment
		//hgap=10-horizontally arranged components,vgap=10-vertically
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		btn4 = new JButton("Button 4");
		
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		setVisible(true);
	}
	//FlowLayout Default layout for JPanel

	public static void main(String[] args) {
		new FlowLayoutDemo();
		
		
	}

}