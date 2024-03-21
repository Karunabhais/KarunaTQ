package Constructor;

public class ParametrizedConstructor {
	
	int id;
	String name;
	
	ParametrizedConstructor(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrizedConstructor obj=new ParametrizedConstructor(1,"K");
	}

}
