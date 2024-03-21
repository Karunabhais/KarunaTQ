package Com.Arrays;

import java.util.Arrays;

public class UnEqualMerge {
	public static int[]merge(int[]arr,int[] arr1)
	{
		int merge[]=new int[arr.length+arr1.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i<arr.length)
			{
			  merge[j++]=arr[i];
			 // merge[j++]=arr1[i];
			}
			if(i<arr1.length)
			{
				merge[j++]=arr1[i];
			}	
			
			
		}
		return merge;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr1[]= {1,2,3,4,5};
       System.out.println(Arrays.toString(arr1));
       int arr2[]= {5,6,7,8,9};
       int a[]=merge(arr1,arr2);
      // System.out.println();
      // System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));
       System.out.println("After merging");
       System.out.println(Arrays.toString(a));
       
	}

}
