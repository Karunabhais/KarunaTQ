package StaticMethods;

public class CounterStatic {

	  static int count=0;
	  
	  CounterStatic()
	  {
		  count++;
	  }
	  void display()
	  {
		  System.out.println(count);
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterStatic obj=new CounterStatic();
		//CounterStatic obj1=new CounterStatic();
		obj.display();
		CounterStatic obj1=new CounterStatic();
		obj1.display();
		CounterStatic obj2=new CounterStatic();
		obj2.display();
		CounterStatic obj3=new CounterStatic();
		obj2.display();
        
	}

}
