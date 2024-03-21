package Com.String;

public class Frequency {
          
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Java is a language";
        int[]freq=new int[s1.length()];
        System.out.println("the enterd string is: " +s1);
        //int i,j;
        char Str[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
        	freq[i]=1;
            for(int j=i+1;j<s1.length();j++)
            {
            	if(Str[i]==Str[j])
            	{ 
            		freq[i]++;
            		Str[j]='0';
            	}
            }
        }
        System.out.println("character of frequancy");
        for(int i=0;i<freq.length;i++)
        {
        	if(Str[i]!='-'&& Str[i]!='0')
        	{
        		System.out.println(Str[i]+"  "+freq[i]);
        	}
        }
        
        	
	}

}






