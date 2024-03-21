package Com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNo {
	public static void setdata(int arr[] )
	{
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++)
	      {
	    	  if(arr[i]%2==0)
	    	  {
	    		  System.out.println(arr[i]);
	    	  }
		
	}
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
      int arr1[]= {1,2,3,4,5};
      EvenNo.setdata(arr1);
      System.out.println("Even no");
     /* for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]%2==0)
    	  {
    		  System.out.println(arr[i]);
    	  }*/
      }
		  
     
      
	}


