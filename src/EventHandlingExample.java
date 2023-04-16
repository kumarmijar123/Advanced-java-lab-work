
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventHandlingExample extends JFrame implements ActionListener {

    private JTextField textField;
    private JPasswordField passwordField;
    private JTextArea textArea;

    public EventHandlingExample() {

        // create a panel to hold components
        JPanel panel = new JPanel();

        // create a label and add it to the panel
        JLabel label = new JLabel("Enter your name:");
        panel.add(label);

        // create a text field and add it to the panel
        textField = new JTextField(20);
        panel.add(textField);

        // create a label for the password field and add it to the panel
        JLabel passwordLabel = new JLabel("Enter your password:");
        panel.add(passwordLabel);

        // create a password field and add it to the panel
        passwordField = new JPasswordField(20);
        panel.add(passwordField);

        // create a button and add it to the panel
        JButton button = new JButton("Submit");
        button.addActionListener(this);
        panel.add(button);

        // create a text area and add it to the panel
        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        panel.add(new JScrollPane(textArea));

        // add the panel to the frame
        add(panel);

        // set the size and visibility of the frame
        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        // get the text from the text field and password field
        String name = textField.getText();
        String password = new String(passwordField.getPassword());

        // clear the text fields
        textField.setText("");
        passwordField.setText("");

        // append the name and password to the text area
        textArea.append("Name: " + name + "\n");
        textArea.append("Password: " + password + "\n");
    }

    public static void main(String[] args) {
        new EventHandlingExample();
    }
}
