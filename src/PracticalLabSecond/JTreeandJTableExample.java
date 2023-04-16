package PracticalLabSecond;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class JTreeandJTableExample extends JFrame {
    private JTree tree;
    private JTable table;
    
    public JTreeandJTableExample() {
        setTitle("Tree and Table Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node 1");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node 2");
        root.add(node1);
        root.add(node2);
        DefaultMutableTreeNode leaf1 = new DefaultMutableTreeNode("Leaf 1");
        DefaultMutableTreeNode leaf2 = new DefaultMutableTreeNode("Leaf 2");
        node1.add(leaf1);
        node1.add(leaf2);
        DefaultMutableTreeNode leaf3 = new DefaultMutableTreeNode("Leaf 3");
        node2.add(leaf3);
        tree = new JTree(root);
        
        // Create the table
        String[] columnNames = {"Name", "Value"};
        Object[][] rowData = {
            {"Item 1", 10},
            {"Item 2", 20},
            {"Item 3", 30}
        };
        table = new JTable(rowData, columnNames);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Add a mouse listener to the tree
        tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 2) {
                    TreePath path = tree.getPathForLocation(e.getX(), e.getY());
                    if (path != null) {
                        Object lastPathComponent = path.getLastPathComponent();
                        if (lastPathComponent instanceof DefaultMutableTreeNode) {
                            DefaultMutableTreeNode node = (DefaultMutableTreeNode) lastPathComponent;
                            Object userObject = node.getUserObject();
                            if (userObject instanceof String) {
                                String nodeName = (String) userObject;
                                System.out.println("Selected node: " + nodeName);
                                if ("Node 1".equals(nodeName)) {
                                    table.getSelectionModel().setSelectionInterval(0, 1);
                                } else if ("Node 2".equals(nodeName)) {
                                    table.getSelectionModel().setSelectionInterval(2, 2);
                                }
                            }
                        }
                    }
                }
            }
        });
        
        // Add the components to the frame
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(new JScrollPane(tree), BorderLayout.WEST);
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JTreeandJTableExample();
    }
}
