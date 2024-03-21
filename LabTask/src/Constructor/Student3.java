package Constructor;

public class Student3 {
	int id=1;
	String name="Karuna";
	
	void diplay()
	{
		System.out.println(id );
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student3 obj=new Student3();
        Student3 obj1=new Student3();
        obj.diplay();
        obj1.diplay();
	}

}
