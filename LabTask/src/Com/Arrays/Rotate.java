package Com.Arrays;

import java.util.Arrays;

public class Rotate {
	public static void rotate(int[]arr)
	{
		int j=0;
		int last=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
			
		
		}
		
		 arr[0]=last;	
     	System.out.println(Arrays.toString(arr));
     		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {4,5,6,7};
        
         System.out.println(Arrays.toString(arr));
         System.out.println();
         rotate(arr);
        
	}

}
