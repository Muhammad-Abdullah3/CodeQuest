import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassAct2 extends JFrame {
    private JButton thumbsUpButton;
    private JTextField messageField;

    public ClassAct2() {
        setLayout(new FlowLayout());

        ImageIcon thumbsUpIcon = new ImageIcon("thumbs up.jpeg");
        thumbsUpButton = new JButton(thumbsUpIcon);
        thumbsUpButton.setBounds(100, 100, 100, 100);
        thumbsUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageField.setText("Logged in Successfully");
            }
        });
        add(thumbsUpButton);

        messageField = new JTextField();
        messageField.setBounds(100, 200, 200, 30);
        add(messageField);
    }

    public static void main(String[] args) {
        ClassAct2 loginPage = new ClassAct2();
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPage.setSize(500, 500);
        loginPage.setVisible(true);
    }
}