package AdvancedSwingComponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TableTreeProgressBar extends JFrame {
	JTree tree;
	JTable table;
	JProgressBar bar;
	
	public TableTreeProgressBar() {
		setTitle("Advanced java Component Frame");
		setSize(400 ,400);
		
		//creating nodes of a tree
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
		DefaultMutableTreeNode vegetable = new DefaultMutableTreeNode("Vegetable");
		DefaultMutableTreeNode fruit = new DefaultMutableTreeNode("Fruit");
		root.add(vegetable);
		root.add(fruit);
		
		DefaultMutableTreeNode cauli = new DefaultMutableTreeNode("Cauli Flower");
		DefaultMutableTreeNode banda = new DefaultMutableTreeNode("Cabbage");
		vegetable.add(cauli);
		vegetable.add(banda);
		
		
		DefaultMutableTreeNode apple = new DefaultMutableTreeNode("Apple");
		DefaultMutableTreeNode mango = new DefaultMutableTreeNode("Mango");
	    fruit.add(apple);
	    fruit.add(mango);
		
		
		
		tree = new JTree();
		add(tree);//tree is added to JFrame
		//Creating Table
		String[] th = {"Title", "Artist", "Album"};
		String[][] data = {{ "Dhirij", "Kumar", "Subash"},
				{"Kumar", "Anuj", "Dhiraj"},
				{"Rides", "Anjit", "Sagar"},
		      };
		
        table = new JTable(data, th);
        JScrollPane pane = new JScrollPane(table);
        add(pane);
        //adding progressbar
        JButton btn = new JButton("Progress");
        bar = new JProgressBar(0, 100);
        bar.setStringPainted(true);
        add(btn);
        add(bar);
        btn.addActionListener(new ActionListener() {
        	int count = 0;
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		count += 10;
        		if(count==100)
        			bar.setString("Complete");
        		else
        		    bar.setValue(count);
        	}
        });
        add(btn);
        add(bar);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new TableTreeProgressBar();
	}

}
