package Com.Arrays;

import java.util.Arrays;

public class Occurance {
	//private static int count;

	public static void show(int[]arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			boolean status=false;
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					status=true;
					break;
				}
			}
			if(!status)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
					
				}
				//System.out.println((arr[i]+" "+count));
				if(count==1)
				{
					System.out.println("Unique Element is: "+arr[i]);
				}
				if(count>1)
				{
					System.out.println("Duplicate Element: "+arr[i]);
				}
				/*int max=0;
				if(count>max)
				{
				   max=count;
				   max=arr[i];
				}*/
			}
		}
		//System.out.println("Most Frequent element is:"+arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []arr= new int[] {1,2,3,1,2,4,4};
       
       System.out.println(Arrays.toString(arr));
       //System.out.println();
       System.out.println("Element frequance");
       System.out.println();
       Occurance.show(arr);
       
       
	}

}
