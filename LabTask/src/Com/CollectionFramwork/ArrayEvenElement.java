package Com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]arr= {1,2,3,4,5,6,7,8,9};
       ArrayList<Integer> even=new ArrayList<Integer>();
       int[]number=new int[2];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       
       for(int i=0;i<number.length;i++)
       {
    	   number[i]=sc.nextInt();
    	   if(number[i]%2==0)
    	   {
    		   even.add(number[i]);
    		   System.out.println("even number is "+even);
    	   }
    	   
    	   
    		   
    	   
    	   
    		   
    	   
       }
       
       
	}

}
