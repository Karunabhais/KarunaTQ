package Com.Arrays;

import java.util.Arrays;

public class AdditionArray {
	public static int[] sum(int arr1[],int arr2[])
	{
		int[]sumArray=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			sumArray[i]=arr1[i]+arr2[i];
		}
		
		return sumArray;
	  }
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr1[]= {1,2,3,4,5};
        int arr2[]= {6,7,8,9,10};
        int resarray[]=sum(arr1,arr2);
        
      //  System.out.println(sum+" ");
        System.out.println(Arrays.toString(resarray));
       // System.out.println(Arrays.toString(arr2));
        
        
    
	}

}
