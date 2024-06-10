import java.sql.*;//packages are used for JDBC (Java Database Connectivity)
import javax.swing.*; // packages are used for building GUI applications in Java Swing.
 
class Main extends JFrame {
 
     JTextField textFieldUsername;
     JPasswordField passwordField;
     JButton buttonRegister;
 
    public Main() 
    {
        setTitle("User Registration");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel();
        JLabel labelUsername = new JLabel("Username:");
        textFieldUsername = new JTextField(20);
        JLabel labelPassword = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        buttonRegister = new JButton("Register");
 
        buttonRegister.addActionListener(e -> registerUser());
 
        panel.add(labelUsername);
        panel.add(textFieldUsername);
        panel.add(labelPassword);
        panel.add(passwordField);
        panel.add(buttonRegister);
 
        add(panel);
        setVisible(true);
    }
 
    private void registerUser() 
    {
        String username = textFieldUsername.getText();
        String password = new String(passwordField.getPassword());
 
        // JDBC connection parameters
        //These lines specify the JDBC connection parameters: URL of the MySQL database 
        String url = "jdbc:mysql://localhost:3306/lab10";
        String dbUsername = "root";
        String dbPassword = "root123";
        //This line establishes a connection to the MySQL database using DriverManager.getConnection().
        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword))
        {
            String sql = "INSERT INTO lab10 (username, password) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) 
            {
                stmt.setString(1, username);
                stmt.setString(2, password);
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) 
                {
                    JOptionPane.showMessageDialog(this, "User registered successfully!");
                    clearFields();
                } else 
                {
                    JOptionPane.showMessageDialog(this, "Failed to register user.");
                }
            }
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
 
    private void clearFields() 
    {
        textFieldUsername.setText("");
        passwordField.setText("");
    }
 
    public static void main(String[] args) {
        new Main();
    }
}
 
