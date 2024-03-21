package Com.Arrays;

import java.util.Arrays;

public class ArrayDecOrder {
	public static int[]Order(int arr[])
	{
		int a1[]=new int [arr.length];
		int temp=0;
		System.out.println("Elements of Original");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return a1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]arr=new int[] {5,2,8,7,1};
        int a[]=Order(arr);
        System.out.println(Arrays.toString(a));
        
      
	}

}
