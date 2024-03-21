package Test5Q;

import java.util.Arrays;

public class ArrCopy {
	public static void copyArr(int arr[][])
	{
		int  carr[][]=new int [arr.length][];
		for(int i=0;i<carr.length;i++)
		{
			carr[i]=new int [arr[i].length];
			for(int j=0;j<carr[i].length;j++)
			{
				carr[i][j]=arr[i][j];
			}
		}
		
		//System.out.println(Arrays.toString(carr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][]= {{1,2,3,4},{5,6,7,8}};
      ArrCopy.copyArr(arr);
	}

}
