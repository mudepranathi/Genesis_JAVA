package lttsjavaa;
//model class or pojo class or bean class because all details are stored in one class
public class Student
{
	private int stid;
	private String stname;
	private String staddr;
	/* Constructor 
	public Student(int stid, String stname, String staddr) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.staddr = staddr;
	}
	*/
	
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStaddr() {
		return staddr;
	}
	public void setStaddr(String staddr) {
		this.staddr = staddr;
	}
	//in encapsulation everytime we should have
	//private variables and public getter and setter methods
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", staddr=" + staddr + "]";
	} //it returns student related data.
	
	
	

}
