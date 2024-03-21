package Com.String;

public class FirstLatterCapital {
	static void show(String s)
	{
		String ns="";
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String w=words[i];
			String firstLatter=w.substring(0,1);
			String remLatter=w.substring(1);
			ns=ns+firstLatter.toUpperCase()+remLatter +" ";
		}
		System.out.println(ns);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="hello welcome to java";
       show(str);
	}

}
