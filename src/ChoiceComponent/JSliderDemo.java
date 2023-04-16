package ChoiceComponent;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderDemo extends JFrame{
	JSlider slider;
	ChangeListener listener;
	JTextField ValueTxt;
	
	public JSliderDemo() {
		setTitle("Slider Frame");
		setSize(400, 400);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		JTextField valuetext = new JTextField();
		listener = new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				JSlider sourece = (JSlider) e.getSource();
				JSlider source;
				ValueTxt.setText(String.valueOf(source.getValue()));
			}
		};
		slider = new JSlider(SwingConstants.Hashtable<VK, X>, 10, 100, 20);
		Hashtable<Integer, Component> labeltbl =
				new Hashtable<Integer, Component>();
		labeltbl.put(0,  new JLabel("A"));
		labeltbl.put(20,  new JLabel("B"));
		labeltbl.put(40, new JLabel("C"));
		labeltbl.put(60, new JLabel("D"));
		labeltbl.put(80, new JLabel("E"));
		
		
		slider.setPaintTicks(true);// shows the major and minor ticks
		slider.setMajorTickSpacing(20);;
		slider.setMinorTickSpacing(5);;
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);//moves to nearest tick(i.e. minor
		Container panel;
		panel.add(slider);
		panel.add(ValueTxt);
		slider = new JSlider();
		slider.addChangeListener(listener);
		add(slider);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	public static void main(String[] args) {
		
		new JSliderDemo();
		

	}

}
