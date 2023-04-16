package ChoiceComponent;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListDemo extends JFrame {
	JList<String> country;
	JLabel label;
	
	public JListDemo() {
		setTitle("JList Frame");
		setSize(300, 300);
		setLayout(new FlowLayout());
		String[] coun = { "Nepal", "China", "Bhutan", "Bangladesh"};
		country = new JList<String>(coun);
		country.addListSelectionListener( (ListSelectionListener) new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				label.setText(country.getSelectedValuesList().toString());
				
				
			}
		});
		add(country);
		add(label);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new JListDemo();

	}

}
