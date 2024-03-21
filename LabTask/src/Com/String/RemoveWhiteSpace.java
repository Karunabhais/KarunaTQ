package Com.String;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str1="Remove White Space";
       //remove the white space using regex:
       str1=str1.replaceAll("\\s+","");
       System.out.println("String after the removing all the white space:" +str1);
	}

}
