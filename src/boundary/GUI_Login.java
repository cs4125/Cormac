package boundary;

import control.Control_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_Login extends JFrame implements ActionListener {

    private static JFrame frame;
    private static JButton loginButton, registerButton;
    private static JPasswordField passwordField;
    private static JTextField userText;
    private String username, password; 

    
    // main method
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "jim 123 = Manager"
                + "\npat 456 = Receptionist"
                + "\njoe 789 = Guest", null, 1);

        GUI_Login loginBox = new GUI_Login();
        loginBox.displayGUI();
    }

    
    private void displayGUI() {

        frame = new JFrame("Hotel JJ Login Panel");
        frame.setSize(300, 150);
        frame.setLocation(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        addActions();
        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 40, 160, 25);
        panel.add(passwordField);

        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        registerButton = new JButton("register");
        registerButton.setBounds(180, 80, 80, 25);
        panel.add(registerButton);

    }

    private void addActions() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char input[] = passwordField.getPassword();
                password = new String(input);
                username = userText.getText();
                frame.dispose();

                // pass 2 Strings to control.Control_Login object
                Control_Login dataTransfer;
                dataTransfer = new Control_Login(username, password);
                dataTransfer.login();
            }
        });

        registerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO
                frame.dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    protected String getUserName() {
        return username;
    }

    protected String getPassword() {
        return password;
    }

}
