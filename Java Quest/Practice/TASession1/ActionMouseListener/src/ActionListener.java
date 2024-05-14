import javax.swing.*;
import java.awt.*;
public class ActionListener 
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(1200,700);
        frame.setVisible(true);
        
        JLabel l1 = new JLabel();
        l1.setText("Enter First Number:");
        l1.setBounds(30,150,90,50);
        frame.add(l1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(120,150,90,50);
        frame.add(tf1);

        JLabel l2 = new JLabel();
        l2.setText("Enter Second number:");
        l2.setBounds(30,250,90,50);
        frame.add(l2);

        JTextField tf2= new JTextField();
        tf2.setBounds(120,250,90,50);
        frame.add(tf2);

        JLabel l3 = new JLabel();
        l3.setText("Result");
        l3.setBounds(30,350,90,50);
        frame.add(l3);

        JTextField tf3= new JTextField();
        tf3.setBounds(120,350,90,50);
        frame.add(tf3);

        JButton b1 = new JButton("Add");
        b1.setBounds(30,450,20,50);
        frame.add(b1);

        JButton b2 = new JButton("Add");
        b2.setBounds(30,450,20,50);
        frame.add(b2);
        JButton b3 = new JButton("Add");
        b3.setBounds(30,450,20,50);
        frame.add(b3);
        JButton b4 = new JButton("Add");
        b3.setBounds(30,450,20,50);
        frame.add(b4);

    }
}
