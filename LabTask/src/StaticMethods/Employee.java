package StaticMethods;

public class Employee {
	
	private int eid;
	private String name;
	private double sal;
	private static int count=1;
	Employee()
	{
	   eid=count;
	   count++;
	}
	
	Employee(  String name,double sal)
	{
		this();
		this.name=name;
		this.sal=sal;
	}
	
		
		
	public  void showData()
	{
		System.out.println("Id:"+eid+" "+name+" "+sal);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee("Karuna",25000);
		obj.showData();
		Employee obj1=new Employee("Kajal",56000);
		obj1.showData();

	}

}
