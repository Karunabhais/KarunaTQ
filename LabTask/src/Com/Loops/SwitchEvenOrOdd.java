package Com.Loops;

import java.util.Scanner;

public class SwitchEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a no");
      int  a=sc.nextInt();
      switch (a%2)
      {
    	  case 1: System.out.println(a+"is Odd no");
    	          break;
    	  default:
    		  System.out.println(a+"is Even no");
      }
      sc.close();
      
	}

}
