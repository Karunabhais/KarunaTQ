package Access1;

import Access.A;

public class E extends A{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 E e=new E();
	       System.out.println(e.a);
	      //System.out.println(e.b);
	       //System.out.println(e.s);
	      System.out.println(e.k);
	       
	       e.showPublic();
	       //e.showPrivate();
	       e.showProtected();
	      
	       //e.showDefault();
	}

}
