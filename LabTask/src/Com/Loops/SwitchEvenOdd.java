package Com.Loops;

import java.util.Scanner;

public class SwitchEvenOdd {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Integer");
		num=sc.nextInt();
		
		switch(num%2)
		{ 
		case 1: System.out.println(num+" is an odd Integer");
		         break;
		         default:
		        	 System.out.println(num+" is an odd Integer");
		        	 
	}
	}
}


