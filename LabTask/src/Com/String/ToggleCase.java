package Com.String;

public class ToggleCase {
	public static void togglecase(String str)
	{
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				char ch1=(char) (str.charAt(i)+32);
						ch[i]=ch1;
			}
			else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				char ch1=(char) (str.charAt(i)-32);
				ch[i]=ch1;
			}
		}
		String str1=new String(ch);
		System.out.println(str1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="My Name Is Karuna";
         togglecase(str);
	}

}
