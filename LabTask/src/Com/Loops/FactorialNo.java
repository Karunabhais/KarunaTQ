package Com.Loops;

public class FactorialNo {
	public void FactNo(int num) {
		 int n= 5;
		 int fact=1;
		
		 for(int i=1;i<=n;i++)//i=2 i=3 
		 {
			fact=fact*i; //1*1=1  1*2  2*3=6
		 }
		 System.out.println(fact);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FactorialNo obj=new FactorialNo();
       obj.FactNo(0);
	}

}
