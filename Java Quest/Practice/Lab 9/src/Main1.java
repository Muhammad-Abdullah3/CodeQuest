import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;
public class  Main1
{
	public static String[] returnDate(String[] date)
    {
    	return date;
    }
	static String[] perdate;
    public static void main(String[] args) 
    {
    	
        JFrame f = new JFrame("Registration Form");
        f.setSize(1280,720);

        JLabel j = new JLabel("Registration Form");
        j.setFont(new Font("Times New Roman", Font.BOLD, 50));
        j.setBounds(500, 20, 500, 40);
        f.add(j);

        JLabel l1 = new JLabel("Name ");
        l1.setBounds(50, 100, 95, 30);
        f.add(l1);

        JTextField text = new JTextField();
        text.setBounds(150, 100, 150, 30);
        f.add(text);
        
        JLabel l2 = new JLabel("Mobile ");
        l2.setBounds(50, 150, 95, 30);
        f.add(l2);

        JTextField text2 = new JTextField();
        text2.setBounds(150, 150, 150, 30);
        f.add(text2);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(50, 210, 95, 30);
        f.add(l3);

        JRadioButton b = new JRadioButton("Male");
        b.setBounds(150, 210, 64, 30);
        f.add(b);

        JRadioButton d = new JRadioButton("Female");
        d.setBounds(220, 210, 70, 30);
        f.add(d);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(b);
        genderGroup.add(d);

        JLabel l4 = new JLabel("DOB");
        l4.setBounds(50, 270, 95, 30);
        f.add(l4);


        String month[] = {"JAN", "FEB", "MARCH", "APRIL", "MAY","JUNE","JULY","AUG","SEP","OCT","NOV","DEC"};
        JComboBox monthBox = new JComboBox(month);
        monthBox.setBounds(110, 270, 80, 30);
        f.add(monthBox);

        String year[] = {"2000", "2001", "2002", "2003", "2004","2006","2007", "2008", "2009", "2010", "2011","2012","2013", "20014", "2015", "2016", "2017","2018"};
        JComboBox yearBox = new JComboBox(year);
        yearBox.setBounds(200, 270, 80, 30);
        f.add(yearBox);
         
        /*monthBox.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String x = (String) monthBox.getSelectedItem();
            	ArrayList<Integer> dates = new ArrayList<>();
                
                
                if(x=="JAN")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="FEB")
                {
                	int count = 28;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="MARCH")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="APRIL")
                {
                	int count = 30;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="MAY")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="JUNE")
                {
                	int count = 30;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="JULY")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="AUG")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="SEP")
                {
                	int count = 30;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="OCT")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="NOV")
                {
                	int count = 30;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                else if(x=="DEC")
                {
                	int count = 31;
                	for(int i = 1;i<=count;i++)
                	{
                		dates.add(i);
                	}
                }
                int sizeArr = dates.size();
                String[] date = new String[sizeArr];
                for(int i = 1;i<=sizeArr;i++)
            	{
            		date[i] = Integer.toString(dates.get(i));
            	}
                Main1.perdate = returnDate(date);
            }
        });*/
        
        String[] dates = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        JComboBox dateBox = new JComboBox(dates);
        dateBox.setBounds(290, 270, 80, 30);
        f.add(dateBox);
        
        JLabel h = new JLabel("Address");
        h.setBounds(50, 330, 95, 30);
        f.add(h);

        JTextField text3 = new JTextField();
        text3.setBounds(150, 330, 150, 100);
        f.add(text3);
        
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(Color.white);
        sidePanel.setBounds(600, 150, 300, 500);
        f.add(sidePanel);

        JButton button = new JButton("Submit");
        button.setBounds(50,490, 95, 30);
        
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                JOptionPane.showMessageDialog(f,"Form Submitted Successfully!!");
            }
        });
        f.add(button);

        JButton button2 = new JButton("Reset");
        button2.setBounds(150, 490, 95, 30);
        f.add(button2);

        button2.addActionListener(new ActionListener() 
        {

            public void actionPerformed(ActionEvent e) 
            {
                text.setText("");
                text2.setText("");
                text3.setText("");
            }
        });

        sidePanel.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e) 
            {
                sidePanel.setBackground(Color.BLUE); // Set the background color of the frame itself
            }
        });
        f.setLayout(null);
        f.setVisible(true);
    }
}
