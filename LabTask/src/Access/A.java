package Access;

public class A {
	public int a;
	private int b;
	int s;
	protected int k;
	
	public A()
	{
		a=10;
		b=20;
		s=30;
		k=40;
	}
	public void showPublic()
	{
		System.out.println("I am in public method");
		
	}
	private void showPrivate()
	{
		System.out.println("I am in private method");
	}
	protected void showProtected()
	{
		System.out.println("I am in protected method");
	}
	void showDefault()
	{
		System.out.println("I am in default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a=new A();
       System.out.println(a.a);
       System.out.println(a.b);
       System.out.println(a.s);
       System.out.println(a.k);
       
       a.showPublic();
       a.showPrivate();
       a.showProtected();
       a.showDefault();
       
	}

}
