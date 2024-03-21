package Com.String;

import java.util.Scanner;

public class Password {
	public static boolean CheckPass(String s)
	{
		boolean flag=false;
		char ch[]=s.toCharArray();
		int count=0;
		if(s.length()>=8)
		{
			flag=true;
			return flag;
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>'A' && ch[i]<'Z')
			{
				flag=true;
				return flag;
			}
		}
		return flag;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter String");
       String s=sc.next();
       System.out.println(s);
       System.out.println(CheckPass(s));
       
       
	}

}
