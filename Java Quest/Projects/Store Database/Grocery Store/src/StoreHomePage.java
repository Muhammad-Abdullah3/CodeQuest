import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoreHomePage extends JFrame {
    private JButton placeOrderButton;
    private JButton productManagementButton;
    private Connection conn;

    public StoreHomePage() {
        super("Grocery Store Homepage");
        setLayout(new FlowLayout());

        placeOrderButton = new JButton("Place Order");
        productManagementButton = new JButton("Manage Products");

        add(placeOrderButton);
        add(productManagementButton);

        // Initialize the database connection
        initializeDatabaseConnection();

        placeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (conn != null) {
                    PlaceOrderFrame orderFrame = new PlaceOrderFrame(conn);
                } else {
                    JOptionPane.showMessageDialog(StoreHomePage.this, "Database connection not established.");
                }
            }
        });

        productManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (conn != null) {
                    ProductManagementFrame productFrame = new ProductManagementFrame(conn);
                } else {
                    JOptionPane.showMessageDialog(StoreHomePage.this, "Database connection not established.");
                }
            }
        });

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeDatabaseConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydb", "root", "root123");
            System.out.println("Connected to database");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error connecting to database: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "JDBC Driver not found: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new StoreHomePage();
    }
}
