package Com.Arrays;

import java.util.Arrays;

public class ArraySwap {
	
	public void ArraySwap (int arr[])
	{
		int temp,j=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		
		}
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num[]= {1,2,3,4,5,6};
        System.out.println("Before Reverse");
        System.out.println(Arrays.toString(num));
        System.out.println("After Reverse");
        System.out.println(Arrays.toString(num));
        
      
	}

}
