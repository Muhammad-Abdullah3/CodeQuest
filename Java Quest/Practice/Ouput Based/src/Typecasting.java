class Animal
{
	String name;
	public void noise()
	{
		System.out.println("I'm an Animal.");
	}
}
class Dog extends Animal
{
	@Override
	public void noise()
	{
		System.out.println("I'm an Animal and a Dog.");
	}
	public void growl()
	{
		System.out.println("GRRr");
	}
}

public class Typecasting
{
	public static void main(String[] args)
	{
		Animal myAn = new Dog();
		Animal myAn2 = new Animal();
		if(myAn instanceof Animal)
		{
			System.out.println("I'm Animal");
		}
		else
		{
			System.out.println("I'm not an Animal");
		}
		if(myAn2 instanceof Dog)
		{
			System.out.println("I'm Dog");
		}
		else
		{
			System.out.println("I'm not a Dog");
		}
	}
}
