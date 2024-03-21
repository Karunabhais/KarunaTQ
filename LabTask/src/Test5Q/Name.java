package Test5Q;

import java.util.Scanner;

public class Name {
	

	public static void main(String[] args) throws InvalidNameException {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your name");
     String name=sc.next();
     if(name.length()<3)
     {
    	 throw new InvalidNameException("name should be greater than 3 character");
    	 
     }
     System.out.println("Welcome  "+name);
     
	}

}
