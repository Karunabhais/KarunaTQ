package Com.String;

public class FirstAndLastWord {
	
	public static void First(String[]arr)
	{
		String rev=" ";
		rev= rev+arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			//String word=arr[i];
			//System.out.println(word);
			for(int j=arr[i].length()-1;j>=1;j--)
			{
				rev= rev+arr[i].charAt(j);
			}
			rev=rev +" ";
		}
		rev= rev+arr[arr.length-1];
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="java is object oriented programming language";
       System.out.println(str);
       String[] arr=str.split(" ");
       First(arr);
	}

}
