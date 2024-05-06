import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public SignupFrame() {
        createSignUpFrame();
    }

    private void createSignUpFrame() {
        setTitle("Sign Up Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel);

        usernameField = new JTextField(15);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        passwordField = new JPasswordField(15);
        add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        add(confirmPasswordLabel);

        confirmPasswordField = new JPasswordField(15);
        add(confirmPasswordField);

        JButton signUpButton = new JButton("Sign Up");
        add(signUpButton);

        signUpButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                // Validate username, password, and confirm password here

                JOptionPane.showMessageDialog(null, "Successfully signed up!");
            }
        });

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}