package Ternary.com;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
      
        age = sc.nextInt();
        
       
		//int a=0;
		//int b=0;
		//byte age1 = (byte) ((a<b)? a:b);
       
		String msg=(age>=18)? "Yes Voting":" Not Voting";
		System.out.println(msg);
		
        
        	
        }
	}


