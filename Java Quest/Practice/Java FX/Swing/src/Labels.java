import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both 
        ImageIcon image1 = new ImageIcon("Contact Icon.png");
        Border border = BorderFactory.createLineBorder(new Color(0, 255, 255), 3);

        JLabel label = new JLabel(); //create a label 
        label.setText("Your Contact"); //set text of label 
        label.setIcon(image1); // set Icon of Label 
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label.setFont(new Font("MV Boli", Font.PLAIN, 100)); //set font of text 
        label.setIconTextGap(-25); //set gap of text to image 
        label.setBackground(new Color(255, 255, 255)); //set background color 
        label.setOpaque(true); //display background color 
        label.setBorder(border); //sets border of label (not image+text) 
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label 
        label.setHorizontalAlignment(JLabel.LEFT); //set horizontal position of icon+text within label
        label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions 

        JLabel label1 = new JLabel(); //create a label 
        label1.setText("Your Contact"); //set text of label1 
        label1.setIcon(image1); // set Icon of Label1 
        label1.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label1.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label1.setFont(new Font("MV Boli", Font.PLAIN, 100)); //set font of text 
        label1.setIconTextGap(-25); //set gap of text to image 
        label1.setBackground(new Color(0, 25, 25)); //set background color 
        label1.setOpaque(true); //display background color 
        label1.setBorder(border); //sets border of label1 (not image+text) 
        label1.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label1 
        label1.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label1
        label1.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
		
        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(1000, 720); 
        frame.setLayout(new java.awt.GridLayout(2, 3)); //set layout to GridLayout with one row and two columns
        frame.setVisible(true);  
        frame.add(label); 
        frame.add(label1); 
        frame.pack(); 
    } 
}
