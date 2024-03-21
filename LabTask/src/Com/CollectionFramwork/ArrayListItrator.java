package Com.CollectionFramwork;

import java.util.ArrayList;

public class ArrayListItrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		
		//for loop
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i)+ " ");
			System.out.println();
			System.out.println("Using Enhance for loop");
			for(Integer e:arr)
			{
				System.out.println(e + " ");
			}
			System.out.println("Using Iterator");
			
			
		}
		
				

	}

}
