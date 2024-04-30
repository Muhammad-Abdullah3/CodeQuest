import javax.swing.*;
import java.awt.event.*;
public class ClassAct2{
    public static void main(String[] args) {
        // Create a JFrame object named a
        JFrame a = new JFrame("My GUI Application");

        // Create a JButton object named b
        JButton b=new JButton(new ImageIcon("images.jpeg"));
        b.setBounds(20, 300, 100, 30);
        
        JTextField tf = new JTextField();
        tf.setBounds(10, 400, 200, 30);
        // Action Listener
        b.addActionListener(new ActionListener()
        {  
        	public void actionPerformed(ActionEvent e)
        	{  
                tf.setText("Logged in ");  
            }  
        });

        // Create a JTextField object named b1
        JTextField b1 = new JTextField();
        b1.setBounds(100, 150, 200, 30);

        // Create a JMenu object named menu
        JMenu menu = new JMenu("File");

        // Create a JMenuBar object named m1
        JMenuBar m1 = new JMenuBar();

        // Create JMenuItem objects named a1 and a2t
        JMenuItem a1 = new JMenuItem("Open");
        JMenuItem a2 = new JMenuItem("Save");

        // Add a1 and a2 to menu
        menu.add(a1);
        menu.add(a2);

        // Add menu to m1
        m1.add(menu);

        // Set JMenuBar for JFrame a
        a.setJMenuBar(m1);

        // Create an ImageIcon object named icon
        ImageIcon icon = new ImageIcon("images.jpeg"); 

        // Create a JLabel object named b2 with the ImageIcon
        JLabel b2 = new JLabel(icon);
        b2.setBounds(40, 280, icon.getIconWidth(), icon.getIconHeight());
        b2.setIcon(icon);

        // Create a JPasswordField object named value
        JPasswordField value = new JPasswordField();
        value.setBounds(20, 250, 200, 30);

        // Create a JLabel object named l1
        JLabel l1 = new JLabel("Enter password:");
        l1.setBounds(20, 250, 80, 30);
        
        JPasswordField value1 = new JPasswordField();
        value.setBounds(20, 200, 200, 30);

        // Create a JLabel object named l1
        JLabel l2 = new JLabel("Enter Username:");
        l1.setBounds(20, 200, 80, 30);

        // Add components to JFrame a
        a.add(b2);
        a.add(value);
        a.add(l1);
        a.add(b);
        a.add(b1);
        a.add(b2);

        // Set JFrame properties
        a.setSize(800, 800);
        a.setLayout(null);
        a.setVisible(true);
    }
}