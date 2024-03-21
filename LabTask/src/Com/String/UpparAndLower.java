package Com.String;

import java.util.Scanner;

public class UpparAndLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str="karuna";
		  char ch;
	      int ascii;
	      Scanner sc= new Scanner(System.in);
	      
	      System.out.print("Enter a Character in Lowercase: ");
	      ch = sc.next().charAt(1);
	      
	      ascii = ch;
	      ascii = ascii - 32;
	      ch = (char)ascii;
	      
	      System.out.println("\nEquivalent Character in Uppercase = " +ch); 
	}

}
