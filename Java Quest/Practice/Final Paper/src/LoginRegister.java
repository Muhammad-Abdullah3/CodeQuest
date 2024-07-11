import javax.swing.*;
import java.awt.*;
import java.sql.*;
class Login
{
	private JFrame frame = new JFrame("User Login");
	public Login()
	{
		frame.setSize(1280,720);
		frame.setBackground(Color.white);
		frame.setLayout(null);
		//
		JLabel label1 = new JLabel("Login");
		label1.setBounds(100,120,300,100);
		label1.setForeground(Color.BLACK);
		frame.add(label1);
		//
		JLabel label2 = new JLabel("Username");
		label2.setBounds(100,200,100,30);
		label2.setForeground(Color.BLACK);
		frame.add(label2);
		//
		JTextField tf1 = new JTextField();
		tf1.setBounds(280,200,100,30);
		frame.add(tf1);
		//
		JLabel label3 = new JLabel("Password");
		label3.setBounds(150,300,100,30);
		label3.setForeground(Color.BLACK);
		frame.add(label3);
		//
		JPasswordField tf2 = new JPasswordField();
		tf2.setBounds(280,300,100,30);
		frame.add(tf2);
		//
		JButton b1 = new JButton("Login");
		b1.setBounds(150,400,100,50);
		//
		String user = tf1.getText();
		String pass = new String(tf2.getPassword());
		JButton b2 = new JButton("Register Now");
		b2.setBounds(150,500,100,50);
		frame.add(b1);
		frame.add(b2);
		b1.addActionListener(e ->
		{
			validateLogin(user,pass);
		});
		b2.addActionListener(e ->
		{
			new Register();
		});
		//
		frame.setVisible(true);
	}
	private void validateLogin(String username,String password)
	{
		String url = "jdbc:mysql://localhost:3306/my_data";
        String dbUsername = "root";
        String dbPassword = "root123";
        String query = "SELECT COUNT(*) FROM users WHERE user_name = ? AND password = ?";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            try {
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(frame, " successfully logged in!");
            } else {
                throw new Exception("Invalid User Name or Password");
            }
            }
            catch(Exception e)
            {
            	JOptionPane.showMessageDialog(frame, e.getMessage());
            }
            
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(frame, e.getMessage());
        }
	}
}
	
class Register
{
	private JFrame frame = new JFrame("User Login");
	public Register()
	{
		frame.setSize(1280,720);
		frame.setBackground(Color.white);
		frame.setLayout(null);
		//
		JLabel label1 = new JLabel("Login");
		label1.setBounds(100,120,300,100);
		label1.setForeground(Color.BLACK);
		frame.add(label1);
		//
		JLabel label2 = new JLabel("Username");
		label2.setBounds(100,200,100,30);
		label2.setForeground(Color.BLACK);
		frame.add(label2);
		//
		JTextField tf1 = new JTextField();
		tf1.setBounds(280,200,100,30);
		frame.add(tf1);
		//
		JLabel label3 = new JLabel("Password");
		label3.setBounds(150,300,100,30);
		label3.setForeground(Color.BLACK);
		frame.add(label3);
		//
		JPasswordField tf2 = new JPasswordField();
		tf2.setBounds(280,300,100,30);
		frame.add(tf2);
		//
		//
		JLabel label4 = new JLabel("Confirm Password");
		label4.setBounds(150,400,100,30);
		label4.setForeground(Color.BLACK);
		frame.add(label4);
		//
		JPasswordField tf3 = new JPasswordField();
		tf3.setBounds(280,400,100,30);
		frame.add(tf3);
		//
		//
		JLabel label5 = new JLabel("Email");
		label5.setBounds(100,480,100,30);
		label5.setForeground(Color.BLACK);
		frame.add(label5);
		//
		JTextField tf4 = new JTextField();
		tf4.setBounds(280,480,100,30);
		frame.add(tf4);
		//
		JButton b1 = new JButton("Register");
		b1.setBounds(150,550,100,50);
		//
		String user = tf1.getText();
		String pass = new String(tf2.getPassword());
		String email = tf4.getText();
		JButton b2 = new JButton("Back to Login");
		b2.setBounds(150,620,100,50);
		frame.add(b2);
		frame.add(b1);
		b1.addActionListener(e ->
		{
			validateSignUp(user,pass,email);
		});
		b2.addActionListener(e ->
		{
			new Login();
		});
		
		//
		frame.setVisible(true);
	}
	private void validateSignUp(String username,String password,String email)
	{
		String url = "jdbc:mysql://localhost:3306/my_data";
        String dbUsername = "root";
        String dbPassword = "root123";
        String query = "INSERT INTO users(user_name,password,email) values (?,?,?)";

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword))
        		{
             try(PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(frame, "User Data Stored Successfully");
             }
             catch(SQLException ex)
             {
            	 JOptionPane.showMessageDialog(frame, ex.getMessage());
             }
            	 
        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(frame, e.getMessage());
        }
	}
}
public class LoginRegister 
{
	public static void main(String[] args)
	{
		new Login();
	}
}
