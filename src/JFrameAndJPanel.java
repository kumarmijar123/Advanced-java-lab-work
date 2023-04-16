import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameAndJPanel extends JFrame {
	JPanel panel1, panel2;// references
	
	public JFrameAndJPanel() {
		setLayout(null);
		panel1 = new JPanel();
		panel1.setBackground(Color.GREEN);
		
		panel1.setBounds(10,50,200,200);
		//panel1.setSize(50, 50);
		panel2 = new JPanel();
		panel2.setBackground(Color.BLUE);
		panel2.setBounds(220,50,200,200);
		//panel2.setSize(50,50);
		add(panel1);
		add(panel2);//added to JFrame
		setTitle("Frame title");
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameAndJPanel();// JFrame is created in memory

	}

}
