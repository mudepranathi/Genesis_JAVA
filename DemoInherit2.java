package lttsjavaa;

class Parent
{
	int a=10;
	Parent()
	{
		System.out.println("Parent/Super/Base class Constructor");
	}
	void displayP()
	{
		System.out.println("Parent class of value "+a);
	}
}
class Child extends Parent
{
	
	Child()
	{
		super();
	}
	void display()
	{
		System.out.println(super.a);
		System.out.println("Child class of value "+a);		
	}
}
public class DemoInherit2 
{
	public static void main(String[]args)
	{
	Child c=new Child();
	c.displayP();
	c.display();
	}

}
