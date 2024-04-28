import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

class SubFrame extends JFrame 
{

	public SubFrame()
	{
		// J Frame is a Window
				// JFrame frame = new JFrame(); // Creating a JFrame Object
				this.setTitle("Contact Management");//4th Step
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//5th Step
				this.setResizable(true);//6th Step
				this.setSize(200,200);//3rd Step
				this.setVisible(true);//2nd Step
				
				ImageIcon image1 = new ImageIcon("C:\\Users\\Muhammad Abdullah\\Desktop\\download.png");// 7
				this.setIconImage(image1.getImage());
				this.getContentPane().setBackground(new Color(0,255,255));
	}

}
