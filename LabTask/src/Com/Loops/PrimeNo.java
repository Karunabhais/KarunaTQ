package Com.Loops;

public class PrimeNo {
	public boolean  primeornot(int num) {
		boolean flag=true;
		if(num==1||num==0)
		{
			flag=false;
		}
		int i=2;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				flag=false;
			}
			i++;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo obj=new PrimeNo();
		int i=1;
		while(i<=100)
		{
			if(obj.primeornot(i))
			{
				System.out.println(i);
				
			}
			i++;
		}
				

	}

}
