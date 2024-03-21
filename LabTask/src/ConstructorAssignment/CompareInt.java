package ConstructorAssignment;

import java.util.Scanner;

/*
 * . Design a class to overload a function compare( ) as follows:
(a) void compare (int, int) – to compare two integer values and print the greater of the two integers.

 */



public class CompareInt {
	
	public void compare(int a,int b)
	{
		if(a>b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in = new Scanner(System.in);
      CompareInt obj=new CompareInt();
      System.out.println("Enter first integer");
      int n1=in.nextInt();
      System.out.println("Enter second integer");
      int n2=in.nextInt();
      System.out.println("greater is..");
      obj.compare(n1, n2);
     // System.out.println("result is"+obj);
      
	}

}
