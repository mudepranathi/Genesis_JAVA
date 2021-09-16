package lttsjavaa;


public class Constructor 
{
	private int sid;
	private static Constructor c2;
	private static Constructor c;
	private static Constructor c1;
	Constructor()
	{
		sid=99006136;
		System.out.println("Student id is "+sid);
	}
	Constructor(int a)
	{
		System.out.println(a);
	}
	Constructor(double a)
	{
		System.out.println(a);
	}
	public static void main(String[]args)
	{
		setC2(new Constructor());
		setC(new Constructor(10));
		setC1(new Constructor(10.0));
		
	}
	public static Constructor getC2() {
		return c2;
	}
	public static void setC2(Constructor c2) {
		Constructor.c2 = c2;
	}
	public static Constructor getC() {
		return c;
	}
	public static void setC(Constructor c) {
		Constructor.c = c;
	}
	public static Constructor getC1() {
		return c1;
	}
	public static void setC1(Constructor c1) {
		Constructor.c1 = c1;
	}
}
