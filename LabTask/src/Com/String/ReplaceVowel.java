package Com.String;

import java.util.Scanner;

public class ReplaceVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 
	        System.out.println("Enter a string :");
	        String str = in.nextLine();
	        String Str1 = "";
	        int len = str.length();

	        for (int i = 0; i < len; i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' ||
	            ch == 'e' ||
	            ch == 'i' ||
	            ch == 'o' ||
	            ch == 'u') {
	                Str1 = Str1 + '#';
	            }
	            else {
	                Str1 = Str1 + ch;
	            }
	            
	        }
	        
	        System.out.println(Str1);
	    
	
	}

}
