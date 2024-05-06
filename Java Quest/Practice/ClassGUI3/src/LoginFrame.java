import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() 
    {
    	{
            setTitle("Login Frame");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 200);
            setLayout(new FlowLayout());

            JLabel usernameLabel = new JLabel("Username:");
            add(usernameLabel);

            usernameField = new JTextField(15);
            add(usernameField);

            JLabel passwordLabel = new JLabel("Password:");
            add(passwordLabel);

            passwordField = new JPasswordField(15);
            add(passwordField);

            JButton loginButton = new JButton("Login");
            add(loginButton);

            JButton signUpButton = new JButton("Sign Up");
            add(signUpButton);

            loginButton.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());

                    // Validate username and password here

                    JOptionPane.showMessageDialog(null, "Successfully logged in!");
                }
            });

            signUpButton.addActionListener(new ActionListener() 
            {
                public void actionPerformed(ActionEvent e) 
                {
                    new SignupFrame().setVisible(true);
                }
            });

            setVisible(true);
    	}
    }
}