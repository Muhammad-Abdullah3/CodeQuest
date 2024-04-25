import java.util.ArrayList;
import java.util.Scanner;
abstract class Contacts
{
	static ArrayList<String> name = new ArrayList<>();
	static ArrayList<String> phoneNum = new ArrayList<>();
	static ArrayList<String> email = new ArrayList<>();
	static ArrayList<String> address = new ArrayList<>();
}
interface ContactFun
{
	public void addContact();
	public void deleteContact(String name);
	public void updateContact(String name);
	public void searchContact(String name);
	public void displayContacts();
}
class User implements ContactFun
{
	boolean elemFound = false;
	static boolean progrTermin = false; 
	Scanner inp = new Scanner(System.in);
	public void addContact()
	{
		System.out.println("Enter the name of new Contact: ");
		String m=inp.nextLine();
		Contacts.name.add(m);
		System.out.println("Enter the Phone number of new Contact: ");
		String n=inp.nextLine();
		Contacts.phoneNum.add(n);
		System.out.println("Enter the email of new Contact: ");
		String o=inp.nextLine();
		Contacts.email.add(o);
		System.out.println("Enter the address of new Contact: ");
		String p=inp.nextLine();
		Contacts.address.add(p);
	}
	public void deleteContact(String name)
	{
		for(int i=0;i<Contacts.name.size();i++)
		{
			if(Contacts.name.get(i)==name)
			{
				Contacts.name.remove(i);
				Contacts.phoneNum.remove(i);
				Contacts.email.remove(i);
				Contacts.address.remove(i);
				System.out.print("Contact Deleted Successfully.");
				elemFound = true;
				break;
			}
		}
		if(!(elemFound))
		{
			System.out.println("Contact Not Found");
		}
	}
	public void updateContact(String name)
	{
		for(int i=0;i<Contacts.name.size();i++)
		{
			if(Contacts.name.get(i)==name)
			{
				System.out.println("Enter the new name of Contact: ");
				String m=inp.nextLine();
				Contacts.name.add(m);
				System.out.println("Enter the new Phone number of Contact: ");
				String n=inp.nextLine();
				Contacts.phoneNum.add(n);
				System.out.println("Enter the new email of Contact: ");
				String o=inp.nextLine();
				Contacts.email.add(o);
				System.out.println("Enter the new address of Contact: ");
				String p=inp.nextLine();
				Contacts.address.add(p);
				System.out.print("Contact Updated Successfully.");
				elemFound = true;
				break;
			}
		}
		if(!(elemFound))
		{
			System.out.println("Contact Not Found");
		}
	}
	public void searchContact(String name)
	{
		for(int i=0;i<Contacts.name.size();i++)
		{
			if(Contacts.name.get(i)==name)
			{
				System.out.print("Contact found.");
				System.out.println("\t\t\t\t\t\t---------Contact Details--------------: ");
				System.out.println("Name:\t\t\t"+Contacts.name.get(i));
				System.out.println("Phone Number:\t\t\t"+Contacts.phoneNum.get(i));
				System.out.println("Email:\t\t\t"+Contacts.email.get(i));
				System.out.println("Address:\t\t\t"+Contacts.address.get(i));
				elemFound = true;
				break;
			}
		}
		if(!(elemFound))
		{
			System.out.println("Contact Not Found");
		}
	}
	public void displayContacts()
	{
		System.out.println("Name\t\t|\tPhone Num\t\t|\tEmail\t\t|\tAddress\t\t|\t ");
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		for(int i=0;i<Contacts.name.size();i++)
		{
			System.out.println(Contacts.name.get(i)+"\t\t|\t"+Contacts.phoneNum.get(i)+"\t\t|\t"+Contacts.email.get(i)+"\t\t|\t"+Contacts.address.get(i)+"\t\t|\t");
		}
	}
	public void displayMenu()
	{
		System.out.println("1.	Add new Contact.\r\n"+ "\r2. Delete Contact. \r\n"
				+ "3.	Update contact information.\r\n"+ "4.	search for contacts by name.\r\n"
				+"5.	display all contacts.\r\n"+ "6.	and exit the program\r\n");
	}
	public void choseFunction()
	{
		System.out.println("Enter any other key beside given option to go back to user menu.");
		displayMenu();
		System.out.println("Enter your choice:");
		int choice = inp.nextInt();
		switch(choice)
		{
		case 1:
			addContact();
			break;
		case 2:
			System.out.println("Enter a name to Delete Contact: ");
			String name1 = inp.nextLine();
			deleteContact(name1);
			break;
		case 3:
			System.out.println("Enter a name to Update Contact: ");
			String name2 = inp.nextLine();
			updateContact(name2);
			break;
		case 4:
			System.out.println("Enter a name to Search Contact: ");
			String name3 = inp.nextLine();
			searchContact(name3);
			break;
		case 5:
			displayContacts();
			break;
		case 6:
			progrTermin = true;
			break;
		default:
			choseFunction();
		}
	}
}
public class Main 
{
	public static void main(String[] args)
	{
		User obj = new User();
		do
		{
			obj.choseFunction();
		}while(!(User.progrTermin));
		
	}
}
