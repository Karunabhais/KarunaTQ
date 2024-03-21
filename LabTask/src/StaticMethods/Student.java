package StaticMethods;

public class Student {
	int rollno;  //instance variable
	String name;
	
	static String college="SIIT";//static variable
	//constructor
	Student(int r,String n)
	{
		rollno=r;
		name=n;
		
	}
	//display value
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created object
          Student obj=new Student(111,"Karuna");
          Student obj1=new Student(222,"Sushant");
          obj.display();
          obj1.display();
          Student.college="ICEM";
          obj.display();
	}

}
