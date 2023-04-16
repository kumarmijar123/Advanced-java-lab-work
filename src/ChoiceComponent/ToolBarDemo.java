package ChoiceComponent;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class ToolBarDemo extends JFrame {
	JPanel panel;
	JMenuBar bar;
    JMenu file, edit, view;
    JMenuItem save, open, exit;
    JCheckBoxMenuItem status;
	
	public ToolBarDemo() {
		
		bar = new JMenuBar();
  	  file = new JMenu("FILE");
  	  file.setMnemonic('F');//alt+f
  	  edit = new JMenu("EDIT");
  	  edit.setMnemonic('E');
  	  view = new JMenu("VIEW");
  	  view.setMnemonic('V');
  	  save = new JMenuItem("Save");
  	  open = new JMenuItem("open");
  	  exit = new JMenuItem("Exit", KeyEvent.VK_X);
  	  exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
  	  exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
  	  }); 
  	  
  	  status = new JCheckBoxMenuItem("Status");
  	  status.setSelected(true);
  	  bar.add(file);
  	  bar.add(edit);
  	  bar.add(view);
  	  file.add(save);
  	  file.add(open);
  	  edit.add(exit);
  	  view.add(status);
  	  setJMenuBar(bar);//it attaches JMenuBar in JFrame
		
		
		setTitle("ToolBar Frame");
		setSize(300, 400);
		panel = new JPanel();
		add(panel);
		//set Actions0
		Action runaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("run.PNG"))) {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
				
			}
		};
		Action openaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("open.PNG"))) {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
				
			}
		};
			Action closeaction = new AbstractAction("Run", new ImageIcon(getClass().getResource("close.PNG"))) {
				@Override
				public void actionPerformed(ActionEvent e) {
					panel.setBackground(Color.GREEN);
					
				}
			};
			
		open.addActionListener(openaction);
		JToolBar bar = new JToolBar();
		bar.add(runaction);
		bar.add(closeaction);
		bar.add(openaction);
		add(bar, BorderLayout.NORTH);//
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new ToolBarDemo();

	}

}
