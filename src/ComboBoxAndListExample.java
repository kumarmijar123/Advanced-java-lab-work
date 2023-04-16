import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class ComboBoxAndListExample extends JFrame implements ActionListener {
    private JComboBox<String> comboBox;
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JButton addButton, removeButton;
    
    public ComboBoxAndListExample() {
        setTitle("Combo Box and List Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the combo box
        String[] items = {"Red", "Green", "Blue"};
        comboBox = new JComboBox<>(items);
        comboBox.addActionListener(this);
        
        // Create the list
        listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        list = new JList<>(listModel);
        
        // Create the buttons
        addButton = new JButton("Add");
        addButton.addActionListener(this);
        removeButton = new JButton("Remove");
        removeButton.addActionListener(this);
        
        // Create the panel to hold the combo box and buttons
        JPanel topPanel = new JPanel();
        topPanel.add(comboBox);
        topPanel.add(addButton);
        topPanel.add(removeButton);
        
        // Add the components to the frame
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(list, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == comboBox) {
            String selectedItem = (String) comboBox.getSelectedItem();
            System.out.println("Selected item: " + selectedItem);
        } else if (source == addButton) {
            String newItem = "New Item";
            listModel.addElement(newItem);
            System.out.println("Added item: " + newItem);
        } else if (source == removeButton) {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex != -1) {
                String removedItem = listModel.remove(selectedIndex);
                System.out.println("Removed item: " + removedItem);
            }
        }
    }
    
    public static void main(String[] args) {
        new ComboBoxAndListExample();
    }
}
