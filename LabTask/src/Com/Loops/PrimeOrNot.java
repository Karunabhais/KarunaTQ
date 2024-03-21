package Com.Loops;

public class PrimeOrNot {
	public boolean checkPrime(int num)
	{
		boolean flag=true;
		if(num==0||num==1)
		{
			flag=false;
		}
			else
			{
				for(int i=2;i<=num/2;i++)
				{
					if(num%i==0)
					{
						flag=false;
						break;
					}
				}
			}
			return flag;
			
	
			}
		
			
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      PrimeOrNot p1=new PrimeOrNot();
      for(int j=400;j>=300;j--)
      { 
    	  if(p1.checkPrime(j))
    	  {
    		  System.out.println(j);
    	  }
      }
    		  
	}

}
