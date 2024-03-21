package Com.String;

import java.util.Arrays;

public class StringWordRev {
	
	   public static void Stringrev(String[] arr)
	   {
		  
		   String rev="";
		   for(int i=0;i<arr.length;i++)
		   {
			   String word=arr[i];
			 System.out.println(word);
			   for(int j=arr[i].length()-1;j>=0;j--)
			   {
				  rev=rev+arr[i].charAt(j);
			   }
			   rev=rev+" ";
			 }
		   System.out.println(rev);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is fun";
		System.out.println(str);
		String[] arr=str.split(" ");
		System.out.println(Arrays.toString(arr));
		Stringrev(arr);
		
	}

}
