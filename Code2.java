package lttsjavaa;
class Test
{
	void showInfo()
	{
		System.out.println("Show method");
	}
} //end of test class
public class Code2 
{
	int a=10;
	float b=20;
	
	void displayInfo() 
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args)
	{
		Code2 obj=new Code2();//creating an object
		Test t=new Test();
		obj.displayInfo();
		t.showInfo();
		//t.displayInfo(); gives an error  because test class doesnt has an displayinfo method
	}

}
