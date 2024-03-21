package ConstructorAssignment;

import java.util.Scanner;

/*
 *   ) void compare (char,char) – to compare the numeric value of two characters and print the character with higher numeric value.
 */
public class CompareChar {
	public void compare (int a,int b)
	{
		 int x=a;
		 int y=b;
		 
		 if(x>y)
		 {
			 System.out.println(x);
		 }
		 else
		 {
			 System.out.println(y);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      CompareChar obj=new CompareChar();
      System.out.println("Enter first character");
      char c1=sc.next().charAt(0);
      System.out.println("Enter first character");
      char c2=sc.next().charAt(0);
      sc.nextLine();
      obj.compare(c1, c2);
      
      
	}

}
