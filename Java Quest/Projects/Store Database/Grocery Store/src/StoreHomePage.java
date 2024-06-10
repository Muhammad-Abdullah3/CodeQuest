import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StoreHomePage extends JFrame 
{

    private JButton placeOrderButton;
    private JButton addProductButton;
    private Connection conn;

    public StoreHomePage() {
        super("Grocery Store Homepage");
        setLayout(new FlowLayout());

        placeOrderButton = new JButton("Place Order");
        addProductButton = new JButton("Add Product");

        add(placeOrderButton);
        add(addProductButton);

        placeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to place order goes here
                // You can create a new JFrame or dialog to take order details
            }
        });

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to add product goes here
                // You can create a new JFrame or dialog to take product details
            }
        });

        // Establish database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydb", "root", "root123");
            System.out.println("Connected to database");
        } catch (Exception ex) {
            System.out.println("Error connecting to database: " + ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
                StoreHomePage homepage = new StoreHomePage();
                homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                homepage.setSize(400, 300);
                homepage.setVisible(true);
    }
}