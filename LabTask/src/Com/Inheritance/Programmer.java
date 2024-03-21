package Com.Inheritance;

public class Programmer extends Employee {
	static int bonus=1000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Programmer p=new Programmer();
      System.out.println("Programmer bonus is:"+bonus);
      System.out.println("Employee salary is:"+salary);
	}

}
