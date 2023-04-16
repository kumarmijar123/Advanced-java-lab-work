package PracticalLabSecond;

import javax.swing.*;
import java.awt.event.*;

public class MenuExample implements ActionListener {

    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu fileMenu, editMenu;
    private JMenuItem openItem, saveItem, copyItem, pasteItem;

    public MenuExample() {
        frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar
        menuBar = new JMenuBar();

        // Create the file menu and add items to it
        fileMenu = new JMenu("File");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Create the edit menu and add items to it
        editMenu = new JMenu("Edit");
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add the menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Add action listeners to the menu items
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Open":
                System.out.println("Opening file...");
                break;
            case "Save":
                System.out.println("Saving file...");
                break;
            case "Copy":
                System.out.println("Copying text...");
                break;
            case "Paste":
                System.out.println("Pasting text...");
                break;
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}

