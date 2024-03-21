package Containment;

public class Department {
	
	private int did;
	private String dname;
	private int MyDate  ;
	
	Department()
	{ 
		System.out.println("default constructor");
		did=1;
		dname="MCA";
		MyDate=0;
	}
	
	public Department(int i, String nm, int MyDate ) {
		
		// TODO Auto-generated constructor stub
		this.did=i;
		this.dname=nm;
		this.MyDate=MyDate;
	}
	public  int getDid() {
		
		return did;
	}
	public void setDid(int did)
	{
		this.did=did;
	}
	public  String getDname()
	{
		return dname;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public void show()
	{
		System.out.println(did+" "+dname);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Department obj=new Department();
        obj.show();
        MyDate d1=new MyDate(9,2,24);
        d1.show();
	}

}
