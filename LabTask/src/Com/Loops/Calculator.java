package Com.Loops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
     int mn,n1,n2;
     System.out.println("Menu:");
     System.out.println("1. Addition");
     System.out.println("2. Multiplication");
     System.out.println("3. Subtraction");
     System.out.println("4. Division");
	 System.out.println("5.  Remainder");
	 System.out.println("Enter your choice(1-5)");
	 mn=sc.nextInt();
	 
	  System.out.println("Enter a number");
	  n1=sc.nextInt();
	  
	  System.out.println("Enter another no");
	  n2=sc.nextInt();
	  
	  switch(mn)
	  {  case 1: 
		      System.out.println("Answer is "+(n1+n2));
		      break;
	    case 2: System.out.println("Answer is "+(n1*n2));
	          break;
	    case 3: System.out.println("Answer is "+(n1-n2));
	          break;
	    case 4: System.out.println("Answer is "+(n1/n2));
	          break;
	    case 5: System.out.println("Answer is "+(n1%n2));
	          break;
	          
	          
	          
	          
	          
	  }
	  
	}
}
