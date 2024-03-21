package Com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OccuEachEle {
	public static void findPosition(int arr[],int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("Position no:="+i);
				
			}
			/*else
			{
				System.out.println("Number is not present in array");
				
			}*/
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  arr[]= {1,3,5,7,8,9,5};
      System.out.println("Enter a number to check position");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      
      System.out.println(Arrays.toString(arr));
      findPosition(arr,num);
	}

}
