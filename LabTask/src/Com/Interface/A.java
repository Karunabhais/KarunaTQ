package Com.Interface;

public class A implements Printable {
	public void print1()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A obj=new A();
       obj.print1();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I am in print method");
	}

}
