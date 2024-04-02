package assignment;

class Parent
{
	void add(int n1,int n2)
	{
		int sum = n1+n2;
		System.out.println("Parent Class");
		System.out.println(sum);
	}
}
class Child extends Parent
{
	@Override
	void add(int n1,int n2)
	{
		int sum = n1+n2;
		int sq = 1;
		for(int i=0;i<n2;i++)
		{
			sq = sq*n1;
		}
		System.out.println("Child Class");
		System.out.println(sq);
	}
}
public class Overrid {

	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.add(3, 2);
		Child obj2 = new Child();
		obj2.add(3, 2);
	}

}
