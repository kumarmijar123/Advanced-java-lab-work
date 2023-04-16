package TextComponentPackage;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

//JCheckBox, JRadioButton, JComboBox, JList, Border, JSlider
public class ChoiceComponents extends JFrame {
	
	JCheckBox box1, box2;
	JRadioButton male, female, notspecified;
	ButtonGroup group;
	
	public ChoiceComponents() {
		setTitle("Choice Frame");
		setSize(400, 400);
		setLayout(new GridLayout(3, 2, 5, 5));
		box1=new JCheckBox("CSIT");
		box2=new JCheckBox("BCA");
		group =new ButtonGroup();
		male = new JRadioButton("Male");
		group.add(male);
		female = new JRadioButton("Female");
		group.add(female);
		notspecified = new JRadioButton("Not Specified");
		add(box1);
		add(box2);
		add(male);
		add(female);
		add(notspecified);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ChoiceComponents();

	}

}
