import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

class login extends JFrame 
{

    JTextField textFieldUsername;
    JPasswordField passwordField;
    JButton buttonLogin;
    JButton buttonSignup;

    public login() {
        setTitle("User Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel labelUsername = new JLabel("Username:");
        textFieldUsername = new JTextField(20);
        JLabel labelPassword = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        buttonLogin = new JButton("Login");
        buttonSignup = new JButton("Sign Up");

        buttonSignup.addActionListener(e -> openRegistrationPage());
        buttonLogin.addActionListener(e -> loginUser());

        panel.add(labelUsername);
        panel.add(textFieldUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(buttonLogin);
        panel.add(buttonSignup);

        add(panel);
        setVisible(true);
    }

    private void openRegistrationPage() {
        new Main();
        dispose(); // Close the login page
    }

    private void loginUser() 
    {
        String username = textFieldUsername.getText();
        String password = new String(passwordField.getPassword());

        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/lab10";
        String dbUsername = "root";
        String dbPassword = "root123";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String sql = "SELECT * FROM lab10 WHERE username = ? and password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String dbPasswordHash = rs.getString("password");
                // You should replace this line with the actual password hashing and verification logic
                if (password.equals(dbPasswordHash)) 
                {
                    JOptionPane.showMessageDialog(this, "Login successful!");
                    clearFields();
                } else 
                {
                    JOptionPane.showMessageDialog(this, "Invalid password.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "User not found.");
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void clearFields() {
        textFieldUsername.setText("");
        passwordField.setText("");
    }

    public static void main(String[] args) 
    {
        new login();
    }
}