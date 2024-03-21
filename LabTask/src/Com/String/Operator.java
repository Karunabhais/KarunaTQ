package Com.String;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1=new String("Test");
       String s2=new String("Test");
       System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+s1.equals(s2));
       
       String s3=new String("Test");
       String s4="test";
       System.out.println(s3.hashCode()+" "+s4.hashCode()+" "+s3.equals(s4));
	}

}
