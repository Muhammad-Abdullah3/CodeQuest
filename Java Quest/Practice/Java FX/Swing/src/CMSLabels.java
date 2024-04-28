import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class CMSLabels {

    public static void main(String[] args) {
        // JLabel = a GUI display area for a string of text, an image, or both 
        ImageIcon image1 = new ImageIcon("Contact Icon.png");
        //ImageIcon newimg = image1.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        Border border = BorderFactory.createLineBorder(new Color(0, 255, 255), 3);

        JLabel label = new JLabel(); //create a label 
        label.setText("Add Contacts"); //set text of label 
        label.setIcon(image1); // set Icon of Label 
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label.setFont(new Font("Arial", Font.PLAIN, 10)); //set font of text 
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
		
		JLabel label2 = new JLabel(); //create a label 
        label2.setText("Your Contact"); //set text of label2 
        label2.setIcon(image1); // set Icon of Label2 
        label2.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label2.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label2.setFont(new Font("MV Boli", Font.PLAIN, 100)); //set font of text 
        label2.setIconTextGap(-25); //set gap of text to image 
        label2.setBackground(new Color(0, 25, 25)); //set background color 
        label2.setOpaque(true); //display background color 
        label2.setBorder(border); //sets border of label2 (not image+text) 
        label2.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label2 
        label2.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label2
        label2.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

		JLabel label3 = new JLabel(); //create a label 
        label3.setText("Your Contact"); //set text of label3 
        label3.setIcon(image1); // set Icon of Label3 
        label3.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label3.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label3.setFont(new Font("MV Boli", Font.PLAIN, 100)); //set font of text 
        label3.setIconTextGap(-25); //set gap of text to image 
        label3.setBackground(new Color(0, 25, 25)); //set background color 
        label3.setOpaque(true); //display background color 
        label3.setBorder(border); //sets border of label3 (not image+text) 
        label3.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label3 
        label3.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label3
        label3.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

		JLabel label4 = new JLabel(); //create a label 
        label4.setText("Your Contact"); //set text of label4 
        label4.setIcon(image1); // set Icon of Label4 
        label4.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label4.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label4.setFont(new Font("MV Boli", Font.PLAIN, 100)); //set font of text 
        label4.setIconTextGap(-25); //set gap of text to image 
        label4.setBackground(new Color(0, 25, 25)); //set background color 
        label4.setOpaque(true); //display background color 
        label4.setBorder(border); //sets border of label4 (not image+text) 
        label4.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label4 
        label4.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label4
        label4.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

		JLabel label5 = new JLabel(); //create a label 
        label5.setText("Your Contact"); //set text of label5 
        label5.setIcon(image1); // set Icon of Label5 
        label5.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon 
        label5.setVerticalTextPosition(JLabel.BOTTOM); //set text TOP,CENTER, BOTTOM of imageicon 
        label5.setFont(new Font("MV Boli", Font.PLAIN, 100)); //set font of text 
        label5.setIconTextGap(-25); //set gap of text to image 
        label5.setBackground(new Color(252, 255, 255)); //set background color 
        label5.setOpaque(true); //display background color 
        label5.setBorder(border); //sets border of label5 (not image+text) 
        label5.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label5 
        label5.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within label5
        label5.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions

        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(1000, 720); 
        frame.setLayout(new java.awt.GridLayout(2, 3)); //set layout to GridLayout with one row and two columns
        frame.setVisible(true);  
        frame.add(label); 
        frame.add(label1); 
		frame.add(label2);
		frame.add(label3); 
        frame.add(label4); 
		frame.add(label5);

        frame.pack(); 
    } 
}
