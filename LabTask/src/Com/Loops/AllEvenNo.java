package Com.Loops;

public class AllEvenNo {
	  public void EvenNo() {
		  int i=1;
		  while(i<=100)
		  {
			  if(i%2==0)
			  {
				  
			  System.out.println(i);
			  }
		  
			  i=i+1;
		  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1;
       AllEvenNo obj=new AllEvenNo();
       
	   obj.EvenNo();
	}

}
