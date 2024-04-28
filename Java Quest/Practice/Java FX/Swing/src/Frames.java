import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;//7 Step

public class Frames 
{
	public static void main(String[] args)
	{
		//J Frame is a Window
		JFrame frame = new JFrame(); // Creating a JFrame Object
		frame.setTitle("Contact Management");//4th Step
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//5th Step
		frame.setResizable(true);//6th Step
		frame.setSize(200,200);//3rd Step
		frame.setVisible(true);//2nd Step
		
		ImageIcon image1 = new ImageIcon("C:\\Users\\Muhammad Abdullah\\Desktop\\download.png");// 7
		frame.setIconImage(image1.getImage());
		frame.getContentPane().setBackground(new Color(0,0,0));
		
		SubFrame myFrame = new SubFrame();
	
	}
}
