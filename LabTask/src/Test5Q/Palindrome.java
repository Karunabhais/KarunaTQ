package Test5Q;

import java.util.Scanner;

/*
 * Special words are those words which starts and ends with the same letter.Examples:
 *  EXISTENCE, COMIC, WINDOW.Palindrome words are those words which read the same from 
 *  left to right and vice-versa. Examples: MALAYALAM, MADAM, LEVEL, ROTATOR, CIVIC. All 
 *  palindromes are special words, but all special words are not palindromes.Write a program
 *   to accept a word, check and print whether the word is a palindrome or only special
 * */
public class Palindrome {
	 public static void Strings(String str)
	 {
		
		 
		 int len=str.length();
		// int j=len-1;
		   boolean palindrome=true;
			 for(int i=0;i<len/2;i++)
			 {
				 if(str.charAt(i)!=str.charAt(len-1))
				 {
					 palindrome=false;
					 break;
				 }
			 }
			 if(palindrome)
			 {
				 System.out.println("String is palindrome");
			 }else
			 {
				System.out.println("String is spical"); 
			 }
			 
				
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
       String str=sc.next();
        Palindrome.Strings(str);
         
       
         
         
	}

}
