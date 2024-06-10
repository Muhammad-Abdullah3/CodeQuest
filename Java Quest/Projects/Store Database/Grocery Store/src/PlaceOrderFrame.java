import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PlaceOrderFrame extends JFrame {
    private JTextField customerNameField;
    private JTextField orderDateField;
    private JTextField totalAmountField;
    private Connection conn;

    public PlaceOrderFrame(Connection conn) {
        super("Place Order");
        this.conn = conn;
        setLayout(new FlowLayout());

        JLabel customerNameLabel = new JLabel("Customer Name:");
        customerNameField = new JTextField(20);

        JLabel orderDateLabel = new JLabel("Order Date:");
        orderDateField = new JTextField(20);

        JLabel totalAmountLabel = new JLabel("Total Amount:");
        totalAmountField = new JTextField(20);

        JButton placeOrderButton = new JButton("Place Order");
        placeOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String customerName = customerNameField.getText();
                    String orderDate = orderDateField.getText();
                    double totalAmount = Double.parseDouble(totalAmountField.getText());
                    String sqlStat = "INSERT INTO orders (cutomer_name, order_date, total_amount) VALUES (?, ?, ?)";
                    PreparedStatement pstmt = conn.prepareStatement(sqlStat);
                    pstmt.setString(1, customerName);
                    pstmt.setString(2, orderDate);
                    pstmt.setDouble(3, totalAmount);
                    pstmt.executeUpdate();

                    JOptionPane.showMessageDialog(PlaceOrderFrame.this, "Order placed successfully!");
                    customerNameField.setText("");
                    orderDateField.setText("");
                    totalAmountField.setText("");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(PlaceOrderFrame.this, "Error placing order: " + ex.getMessage());
                }
            }
        });

        add(customerNameLabel);
        add(customerNameField);
        add(orderDateLabel);
        add(orderDateField);
        add(totalAmountLabel);
        add(totalAmountField);
        add(placeOrderButton);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}