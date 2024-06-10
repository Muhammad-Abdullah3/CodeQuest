import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductManagementFrame extends JFrame {

    private JTextField productNameField;
    private JTextField productDescriptionField;
    private JTextField productPriceField;
    private JButton addButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JTable productTable;
    private DefaultTableModel tableModel;
    private Connection conn;

    public ProductManagementFrame(Connection conn) {
        super("Product Management");
        this.conn = conn;
        setLayout(new BorderLayout());

        // Create table model and table
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Description", "Price"}, 0);
        productTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(productTable);
        add(tableScrollPane, BorderLayout.CENTER);

        // Create form panel
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(new JLabel("Product Name:"));
        productNameField = new JTextField();
        formPanel.add(productNameField);
        formPanel.add(new JLabel("Product Description:"));
        productDescriptionField = new JTextField();
        formPanel.add(productDescriptionField);
        formPanel.add(new JLabel("Product Price:"));
        productPriceField = new JTextField();
        formPanel.add(productPriceField);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        addButton = new JButton("Add Product");
        buttonPanel.add(addButton);
        updateButton = new JButton("Update Product");
        buttonPanel.add(updateButton);
        deleteButton = new JButton("Delete Product");
        buttonPanel.add(deleteButton);

        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        // Load products from database
        loadProductsFromDatabase();

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateProduct();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteProduct();
            }
        });

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void loadProductsFromDatabase() {
        try (Statement stmt = conn.createStatement()) {
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM products");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                double price = resultSet.getDouble("price");
                tableModel.addRow(new Object[]{id, name, description, price});
            }
        } catch (SQLException e) {
            System.out.println("Error loading products from database: " + e.getMessage());
        }
    }

    private void addProduct() {
        String name = productNameField.getText();
        String description = productDescriptionField.getText();
        double price = Double.parseDouble(productPriceField.getText());
        try (PreparedStatement pstmt = conn.prepareStatement("INSERT INTO products (name, description, price) VALUES (?, ?, ?)")) {
            pstmt.setString(1, name);
            pstmt.setString(2, description);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();
            tableModel.addRow(new Object[]{getLastInsertedId(), name, description, price});
            productNameField.setText("");
            productDescriptionField.setText("");
            productPriceField.setText("");
        } catch (SQLException ex) {
            System.out.println("Error adding product to database: " + ex.getMessage());
        }
    }

    private void updateProduct() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            String name = productNameField.getText();
            String description = productDescriptionField.getText();
            double price = Double.parseDouble(productPriceField.getText());
            try (PreparedStatement pstmt = conn.prepareStatement("UPDATE products SET name = ?, description = ?, price = ? WHERE id = ?")) {
                pstmt.setString(1, name);
                pstmt.setString(2, description);
                pstmt.setDouble(3, price);
                pstmt.setInt(4, id);
                pstmt.executeUpdate();
                tableModel.setValueAt(name, selectedRow, 1);
                tableModel.setValueAt(description, selectedRow, 2);
                tableModel.setValueAt(price, selectedRow, 3);
            } catch (SQLException ex) {
                System.out.println("Error updating product in database: " + ex.getMessage());
            }
        }
    }

    private void deleteProduct() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tableModel.getValueAt(selectedRow, 0);
            try (PreparedStatement pstmt = conn.prepareStatement("DELETE FROM products WHERE id = ?")) {
                pstmt.setInt(1, id);
                pstmt.executeUpdate();
                tableModel.removeRow(selectedRow);
            } catch (SQLException ex) {
                System.out.println("Error deleting product from database: " + ex.getMessage());
            }
        }
    }

    private int getLastInsertedId() throws SQLException {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID()")) {
            if (rs.next()) {
                return rs.getInt(1);
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocerydb", "root", "root123");
            new ProductManagementFrame(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
