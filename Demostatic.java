package lttsjavaa;

public class Demostatic
{
	static int c=0;
	static void Inc()
	{
		c++;
		System.out.println(c);
	}
	static //this block will only executed first before main method.
	{
		System.out.println("Static block");
	}
	public static void main(String[]args)
	{
		c=101; //with creating object we can directly intialise value of static.
		//static method only access only static data.
		Inc(); //as the method is static we can access it without ibject creation.
		
	}

}
