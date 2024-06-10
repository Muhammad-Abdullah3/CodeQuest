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

        placeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement place order logic here
                PlaceOrderFrame orderFrame = new PlaceOrderFrame(conn);
            }
        });

        productManagementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydb", "root", "root123");
                    System.out.println("Connected to database");

                    ProductManagementFrame productFrame = new ProductManagementFrame(conn);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(StoreHomePage.this, "Error connecting to database: " + ex.getMessage());
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(StoreHomePage.this, "JDBC Driver not found: " + ex.getMessage());
                }
            }
        });

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StoreHomePage();
    }
}
