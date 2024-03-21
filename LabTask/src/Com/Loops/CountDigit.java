package Com.Loops;

public class CountDigit {
	
	public void Digit(int num)
	{
		int n;
		int count=0;
	  
		while(num !=0)
	    {
	    	num=num/10;
	    	count++;
	    }
		
		System.out.println(" digit:"+count);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CountDigit obj=new CountDigit();
      int num = 12345;
	   obj.Digit(num);
	}

}
