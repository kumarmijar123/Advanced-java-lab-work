package TextComponentPackage;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextComponents extends JFrame {
	JLabel label, uname;
	JTextField text;
	JTextArea area;
	JPasswordField pass;

	public TextComponents() {
		label = new JLabel();
		label.setText("User Info");
		uname = new JLabel();

		Icon ic = new ImageIcon(getClass().getResource("icon.png"));
		uname.setIcon(ic);
		text = new JTextField(20);
		area = new JTextArea(4, 20);
		JScrollPane pane = new JScrollPane(area);
		pass = new JPasswordField(20);
		setTitle("Text Components");
		setLayout(new FlowLayout());
		setSize(300, 300);
		add(label);
		add(uname);
		add(text);
		add(pass);
		add(pane);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TextComponents();
	}

}
