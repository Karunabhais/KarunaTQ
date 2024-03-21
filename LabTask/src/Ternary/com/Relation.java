
/*
 * 832 - 594
 * 51 - 36
 * 7977 - 180
 * 1 - 0
 * 665- 99
 * 149 - 0		
 */
package Ternary.com;

import java.util.Scanner;

public class Relation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       int digit =0;
       int sum=0;
       int i1=0;
       for(int i=num;i>0;i=i/10);
       {
    	   
		
		digit = i1%10;
		sum=sum%10+digit;
       }
       int res=num-sum;
       if(res>=0)
       {
    	   System.out.println(res);
    	   
       }
       else
       {
    	   System.out.println(0);
       }
	}

}
