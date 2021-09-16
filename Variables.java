package lttsjavaa;

public class Variables
{
	String name1="Mude"; //global variable
	static int c=0;//static variable cannot be reintialised
	void display1()
	{
		String name="Pranathi"; //local variable
		System.out.println(name1+" "+name); //accessing both global and local variable
		c++;
		System.out.println(c);
	}
	
	public static void main(String[]args)
	{
		Variables v=new Variables();
		v.display1(); //c value will be 1 as intial c value is 0
		Variables v1=new Variables();
		v1.display1(); // c value will be 2 as c is static and value has been incremented by 1
	}

}
