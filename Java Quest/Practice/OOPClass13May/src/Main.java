/*import javax.swing.*;
import java.awt.*;
 
public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Null Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
 
        // Create a JPanel with null layout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
 
        // Create components and set their bounds explicitly
        JLabel label1 = new JLabel("Username:");
        //label1.setBounds(20, 20, 80, 25);
 
        JTextField textField = new JTextField();
        textField.setBounds(100, 20, 160, 25);
 
        JLabel label2 = new JLabel("Password:");
        //label2.setBounds(20, 60, 80, 25);
 
        JPasswordField passwordField = new JPasswordField();
        //passwordField.setBounds(100, 60, 160, 25);
 
        JButton loginButton = new JButton("Login");
        //loginButton.setBounds(100, 100, 80, 30);
        
        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(100, 150, 80, 30);
 
        // Add components to the panel
        panel.add(label1);
        panel.add(textField);
        panel.add(label2);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(signUpButton);
        
        // Add panel to the frame
        frame.add(panel);
 
        // Set frame visibility
        frame.setVisible(true);
    }
}

/*
import javax.swing.*;
import java.awt.*;
 
public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());
 
        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
 
        // Add components to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
 
        // Add panel to the frame
        frame.add(panel);
 
        // Set frame size and visibility
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
*/
/*
import javax.swing.*;
import java.awt.*;
 
public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create a JPanel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT,30,20));
 
        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
 
        // Add components to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
 
        // Add panel to the frame
        frame.add(panel);
 
        // Set frame size and visibility
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}
*/

/*
import javax.swing.*;
import java.awt.*;
 
public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create components
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");
 
        // Create a JPanel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
 
        // Add components to the panel with specific regions
        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);
 
        // Add panel to the frame
        frame.add(panel);
 
        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
*/



/*
import javax.swing.*;
import java.awt.*;
 
public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create components
        JButton northButton1 = new JButton("North Button 1");
        JButton northButton2 = new JButton("North Button 2");
        JButton northButton3 = new JButton("North Button 3");
        JButton southButton1 = new JButton("South Button 1");
        JButton southButton2 = new JButton("South Button 2");
        JButton eastButton1 = new JButton("East Button 1");
        JButton eastButton2 = new JButton("East Button 2");
        JButton westButton1 = new JButton("West Button 1");
        JButton westButton2 = new JButton("West Button 2");
 
        // Create a JPanel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
 
    
        // Create a JPanel for each region with GridLayout(1, 2)
        JPanel northPanel = new JPanel(new GridLayout(2, 3));
        JPanel southPanel = new JPanel(new GridLayout(1, 2));
        JPanel eastPanel = new JPanel(new GridLayout(2, 1));
        JPanel westPanel = new JPanel(new GridLayout(2, 1));
 
        // Add buttons to the panels
        northPanel.add(northButton1);
        northPanel.add(northButton2);
        northPanel.add(northButton3);
        southPanel.add(southButton1);
        southPanel.add(southButton2);
        eastPanel.add(eastButton1);
        eastPanel.add(eastButton2);
        westPanel.add(westButton1);
        westPanel.add(westButton2);
 
        // Set layout for each region
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        mainPanel.add(eastPanel, BorderLayout.EAST);
        mainPanel.add(westPanel, BorderLayout.WEST);
 
        // Add main panel to the frame
        frame.add(mainPanel);
 
        // Set frame size and visibility
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
*/
/*
import javax.swing.*;
import java.awt.*;
 
public class Main {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");
 
        // Create a JPanel with GridLayout
        JPanel panel = new JPanel(new GridLayout(2, 3)); // 2 rows, 3 columns
 
        // Add components to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button10);
 
        // Add panel to the frame
        frame.add(panel);
 
        // Set frame size and visibility
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
*/
/*
import javax.swing.*;
import java.awt.*;
 
public class Main{
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Create components
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
 
        // Create a JPanel with BoxLayout (vertical)
        JPanel panel = new JPanel();
        //panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Arrange components vertically
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        // Add components to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
 
        // Add panel to the frame
        frame.add(panel);
 
        // Set frame size and visibility
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
*/
/*
import java.awt.*;    
import javax.swing.*;    
public class Main {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("GroupLayoutExample");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container contentPanel = frame.getContentPane();  
        GroupLayout groupLayout = new GroupLayout(contentPanel);  
  
        contentPanel.setLayout(groupLayout);  
  
        JLabel clickMe = new JLabel("Click Here");  
        JButton button = new JButton("This Button");  
  
        groupLayout.setHorizontalGroup(  
                    groupLayout.createSequentialGroup()  
                                .addComponent(clickMe)  
                                .addGap(10, 20, 100)  
                                .addComponent(button));  
        groupLayout.setVerticalGroup(  
                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(clickMe)  
                                .addComponent(button));  
        frame.pack();  
        frame.setVisible(true);  
    }  
}  */

import java.awt.Button;  
import java.awt.GridBagConstraints;  
import java.awt.GridBagLayout;  
 /* 
import javax.swing.*;  
public class Main extends JFrame{  
    public static void main(String[] args) {  
            Main a = new Main();  
        }  
        public Main() {  
        	GridBagLayout grid = new GridBagLayout();  
            GridBagConstraints gbc = new GridBagConstraints();  
            setLayout(grid);  
            setTitle("GridBag Layout Example");  
            GridBagLayout layout = new GridBagLayout();  
    this.setLayout(layout);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridx = 0;  
    gbc.gridy = 0;  
    this.add(new Button("Button One"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 0;  
    this.add(new Button("Button two"), gbc);  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.ipady = 20;  
    gbc.gridx = 0;  
    gbc.gridy = 1;  
    this.add(new Button("Button Three"), gbc);  
    gbc.gridx = 1;  
    gbc.gridy = 1;  
    this.add(new Button("Button Four"), gbc);  
    gbc.gridx = 0;  
    gbc.gridy = 2;  
    gbc.fill = GridBagConstraints.HORIZONTAL;  
    gbc.gridwidth = 2;  
    this.add(new Button("Button Five"), gbc);  
            setSize(300, 300);  
            setPreferredSize(getSize());  
            setVisible(true);  
            setDefaultCloseOperation(EXIT_ON_CLOSE);  
      
        }  
      
}  
*/
