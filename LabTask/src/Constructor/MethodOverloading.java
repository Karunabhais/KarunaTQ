package Constructor;

public class MethodOverloading {
	
	static int add(int a,int b)
	{
		return a+b;
	}
	//changing no of arguments use of int
  //static int add(int a,int b,int c)
	//changing data type of arguments use of double
  static double add(double a,double b,double c)
  {
	  return a+b+c;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		System.out.println(MethodOverloading.add(11, 11));
		System.out.println(MethodOverloading.add(12.3,12.6,12.5));
	}

}
