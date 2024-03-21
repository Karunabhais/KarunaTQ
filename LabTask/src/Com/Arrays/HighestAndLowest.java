package Com.Arrays;

public class HighestAndLowest {
	public static void show(int[]num)
	{
		int lowest=num[0];
		int Highest=num[0];
		//int lowest=num[0];
		
		for(int i=1;i<num.length;i++)
			
			if(num[i]>Highest)
				Highest=num[i];
			
			else if(num[i]< lowest)
				lowest=num[i];
			
			
			 System.out.println("Highest Number is:"+Highest);
		        System.out.println("Lowest Number is:"+ lowest);
			
		}
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num[]=new int[] {55,45,65,2,89};
        HighestAndLowest.show(num);
        
	}

}
