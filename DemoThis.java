package lttsjavaa;

public class DemoThis 
{
	String fname;
	String lname;
	DemoThis()
	{
		System.out.println("Default Constructor");
	}
	DemoThis(String fname,String lname)
	{
		this();
		this.fname=fname;
		this.lname=lname;
	}
	void display()
	{
		System.out.println("Display Method");
	}
	void displayInfo()
	{
		
		System.out.println(fname+" "+lname);
		this.display();
	}
	public static void main(String[]args)
	{
		DemoThis d=new DemoThis("Mude","Pranathi");
		d.displayInfo(); //displays null value if this keyword has not been added because the variables are instance variables.
		//displays values if this keyword is used.
	}

}
