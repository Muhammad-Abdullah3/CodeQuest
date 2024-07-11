import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserAuthentication {

    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("Login");
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("User Name");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordText = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton registerNowButton = new JButton("Register Now");

        loginPanel.add(userLabel);
        loginPanel.add(userText);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordText);
        loginPanel.add(loginButton);
        loginPanel.add(registerNowButton);

        loginFrame.add(loginPanel);
        loginFrame.setSize(300, 150);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);

        JFrame registerFrame = new JFrame("Register");
        JPanel registerPanel = new JPanel();
        registerPanel.setLayout(new GridLayout(5, 2));

        JLabel registerUserLabel = new JLabel("User Name");
        JTextField registerUserText = new JTextField();
        JLabel registerPasswordLabel = new JLabel("Password");
        JPasswordField registerPasswordText = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password");
        JPasswordField confirmPasswordText = new JPasswordField();
        JLabel emailLabel = new JLabel("Email");
        JTextField emailText = new JTextField();
        JButton signUpButton = new JButton("Sign Up");
        JButton backToLoginButton = new JButton("Back to Login");

        registerPanel.add(registerUserLabel);
        registerPanel.add(registerUserText);
        registerPanel.add(registerPasswordLabel);
        registerPanel.add(registerPasswordText);
        registerPanel.add(confirmPasswordLabel);
        registerPanel.add(confirmPasswordText);
        registerPanel.add(emailLabel);
        registerPanel.add(emailText);
        registerPanel.add(signUpButton);
        registerPanel.add(backToLoginButton);

        registerFrame.add(registerPanel);
        registerFrame.setSize(300, 250);
        registerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        registerNowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginFrame.setVisible(false);
                registerFrame.setVisible(true);
            }
        });

        backToLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerFrame.setVisible(false);
                loginFrame.setVisible(true);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (validateLogin(username, password)) {
                    JOptionPane.showMessageDialog(loginFrame, "Successfully logged in");
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid username or password");
                }
            }
        });

        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = registerUserText.getText();
                String password = new String(registerPasswordText.getPassword());
                String confirmPassword = new String(confirmPasswordText.getPassword());
                String email = emailText.getText();

                if (!password.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(registerFrame, "Passwords do not match");
                    return;
                }

                if (registerUser(username, password, email)) {
                    JOptionPane.showMessageDialog(registerFrame, "Successfully signed up");
                    registerFrame.setVisible(false);
                    loginFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(registerFrame, "Username already exists");
                }
            }
        });
    }

    private static boolean validateLogin(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private static boolean registerUser(String username, String password, String email) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        users.add(new User(username, password, email));
        return true;
    }
}

class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
