package lttsjavaa;

public class StudentS 
{
	public static void main(String[]args)
	{
		Student s=new Student();
		Student s1=new Student();
		//each object creates new memory location.
		s.setStid(99006136);
		s.setStname("MUDE PRANATHI");
		s.setStaddr("GUNTUR");
		System.out.println(s);
		System.out.println(s.getStid()+" "+s.getStname()+" "+s.getStaddr());		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		
	}

}
