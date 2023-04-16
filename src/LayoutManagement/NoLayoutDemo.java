package LayoutManagement;

import javax.swing.*;

public class NoLayoutDemo extends JFrame{
		JLabel reg, fnlbl, lnlbl, emaillbl, aboutlbl;
		JTextField fntxt, lntxt, emailtxt;
		JTextArea abouttxt;
		JButton submit;
		
		public NoLayoutDemo() {
		
			super("No Layout");
			
			setLayout(null);
			
			//JLabels
			reg = new JLabel("Registration Form");
			reg.setBounds(50, 10, 200, 20);
			add(reg); ;// added at (50, 20) position of JFrame
			
			fnlbl = new JLabel("First Name");
			fnlbl.setBounds(10, 40, 100, 20);
			add(fnlbl);
			
			lnlbl = new JLabel("Last Name");
			lnlbl.setBounds(10, 40, 100, 20);
			add(lnlbl);
			
			emaillbl = new JLabel("Email");
			aboutlbl = new JLabel("About");
			add(emaillbl);
			
			aboutlbl = new JLabel("About");
			aboutlbl.setBounds(10, 160, 100, 20);
			add(aboutlbl);
			
			// JTextFields
			fntxt = new JTextField(20);
			fntxt.setBounds(120, 80, 100, 20);
			add(fntxt);
			
		    lntxt = new JTextField(20);
			lntxt.setBounds(120, 80, 100, 20);
			add(lntxt);
			
			emailtxt = new JTextField(20);
			emailtxt.setBounds(120, 120, 100, 20);
			add(emailtxt);
			
			//JTextArea
			abouttxt = new JTextArea(4, 20);
			//abouttxt.setBounds(120, 160, 100, 20);
			JScrollPane pane = new JScrollPane(abouttxt);
			pane.setBounds(120, 160, 100, 120);
			add(pane);
			
			//Button
			submit = new JButton(" Submit");
			submit.setBounds(120, 500, 100, 20);
			add(submit);
			
			//JFrame Configuration
			setSize(300, 400);
			setVisible(true);
			setDefaultCloseOperation(ABORT);
		}
	

	public static void main(String[] args) {
		new NoLayoutDemo();

	}

}
