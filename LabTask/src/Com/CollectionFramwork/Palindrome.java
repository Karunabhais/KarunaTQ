package Com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome{
	public static boolean isPalindrome(ArrayList<String>word)
	{
		for(int i=0;i<word.size();i++)
		 // s.add(word.charAt(i) + " ");
			if(!(word.get(i).equals(word.get(i))))
                return false;
		return false;
	    
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 String Palindrome;
		 Palindrome=sc.nextLine();
		 ArrayList<String> str=new ArrayList<String>();
		// if(isPalindrome(P))
			 System.out.println(Palindrome+"is a palindrome:");
		// else
		 {
			 System.out.println(Palindrome +"is not palindrome");
		 }
      
        
        
        
        
	}

	
	}


