package Com.Exception;

import java.util.Scanner;

//import javax.xml.crypto.dsig.dom.DOMValidateContext;

public class InputPassword {
	static boolean validatePassword(String p)
	{
		int ucount=0;
		int lcount=0;
		int numcount=0;
		int spcount=0;
		
		for(int i=0;i<p.length();i++)
		{
			if(Character.isUpperCase(p.charAt(i)))
				ucount++;
			if(Character.isLowerCase(p.charAt(i)))
				lcount++;
			if(Character.isDigit(p.charAt(i)))
				numcount++;
			if(p.charAt(i)=='#'|| p.charAt(i)=='@'|| p.charAt(i)=='.')
				spcount++;
			}
		  if(ucount<1||lcount<1||numcount<1||spcount<1)
			  return false;
		  else
		  {
			  return true;
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user name");
        String user=sc.next();
        System.out.println("Enter password");
        String pass=sc.next();
        
        try{
        	{
        		if(pass.length()<8)
        		{
        			throw new InvalidPassException("Password length must be greater than 8 charater");
        		}
        		if(!validatePassword(pass))
        		{
        			throw new InvalidPassException("password must be #,.,@");
        		}
        	}
        	System.out.println("Registration completly for:"+user);
        }
        	catch(InvalidPassException e)
        	{
        		System.out.println(e);
        	}
          finally
          {
        	  sc.close();
          }
        System.out.println("code ends...");
        
	}

	
	}


