/*
  import javax.swing.*;    
 
public class GUIClass2 {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Chess Game");  
    JButton b=new JButton("Play Game");
    
    b.setBounds(50,100,190,30);  
    f.add(b);  
    
    JButton b1=new JButton("Puzzles");
    
    b1.setBounds(50,150,190,30);  
    f.add(b1);
    
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  */

/*
import java.awt.event.*;  
import javax.swing.*;    
public class GUIClass2 {  
public static void main(String[] args) 
{  
    JFrame f=new JFrame("Button Example");  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50, 150,20);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener()
    {  
    	public void actionPerformed(ActionEvent e)
    	{  
            tf.setText("Welcome to Javatpoint.");  
        }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  */

/*
import java.awt.event.*;
import javax.swing.*;      
public class GUIClass2
{    
//Start of the Constructor
GUIClass2()
{    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("thumbs up.jpeg"));    
b.setBounds(100,10,140, 80);    
f.add(b);

final JTextField tf=new JTextField();  
tf.setBounds(100,200, 150,20);

b.addActionListener(new ActionListener()
{  
	public void actionPerformed(ActionEvent e)
	{  
        tf.setText("Welcome to Javatpoint.");  
    }  
});

f.add(b);f.add(tf);
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}
// End of the constructor
public static void main(String[] args) 
{    
    new GUIClass2();    
}    
}  
*/




////////////// JLabel Start ////////////////////
import javax.swing.*;  
class LabelExample  
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Label Example");  
    JLabel l1,l2;  
    l1=new JLabel("First Label.");  
    l1.setBounds(50,50, 100,30);  
    l2=new JLabel("Second Label.");  
    l2.setBounds(50,100, 100,30);  
    f.add(l1); f.add(l2);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
}
//////

////// JCheck Box /////

/////