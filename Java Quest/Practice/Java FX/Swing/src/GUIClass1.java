import javax.swing.*;
public class GUIClass1 
{
    public static void main(String[] args) 
    {
        JFrame frame1 = new JFrame("Hello World");
        JButton button1 = new JButton("Button");
        button1.setBounds(40,90,85,20);
        JButton button2 = new JButton("Button2");
        button2.setBounds(40,140,85,20);

        JTextField textField1 = new JTextField();
        textField1.setBounds(40,190,85,20);

        JScrollBar sb = new JScrollBar();
        sb.setBounds(40,240,85,20);
        
        JMenu menu = new JMenu();
        JMenuBar mb1 = new JMenuBar();
        JMenuItem item1 = new JMenuItem();
        JMenuItem item2 = new JMenuItem();
        

        frame1.add(button1);
        frame1.add(button2);
        frame1.add(textField1);
        frame1.add(sb);
        frame1.setLayout(null);
        frame1.setSize(1080,720);
        frame1.setVisible(true);
        frame1.pack();
        
    }

}
