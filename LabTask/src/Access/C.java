package Access;

public class C extends A {

	protected void showProtected()
	{
		System.out.println("Default subclass method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 A a=new A();
	       System.out.println(a.a);
	     // System.out.println(a.b);
	       System.out.println(a.s);
	       System.out.println(a.k);
	       
	       a.showPublic();
	       //a.showPrivate();
	       a.showProtected();
	       //a.showPublic();
	       a.showDefault();
	       
	       C c=new C();
	      
	       System.out.println(a.a);
	     // System.out.println(a.b);
	       System.out.println(a.s);
	       System.out.println(a.k);
	       
	       a.showPublic();
	       //a.showPrivate();
	       a.showProtected();
	       //a.showPublic();
	       a.showDefault();

	}

}
