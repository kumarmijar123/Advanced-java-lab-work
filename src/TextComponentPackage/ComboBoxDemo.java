package TextComponentPackage;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ComboBoxDemo extends JFrame {
	JComboBox<String> cb;
	JLabel lbl;
	

	
	
	
	public ComboBoxDemo() {
		String country[] = {"Nepal", "India", "Pakistan"};
		cb = new JComboBox<String>(country);
		lbl = new JLabel();
		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {//EventHandler
				lbl.setText((String) cb.getSelectedItem());
			}
		});
		cb.addItem("Argentina");
		setTitle("Combobox");
		setLayout(new FlowLayout());
		setSize(300, 300);
		add(cb);
		add(lbl);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ComboBoxDemo();

	}

}
