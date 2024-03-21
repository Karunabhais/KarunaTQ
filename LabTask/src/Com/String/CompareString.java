package Com.String;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="Karuna";
      String s2="Karuna";
      String s3=new String("Karuna");
      System.out.println(s1==s2);//beacuse both refer is different
      System.out.println(s1==s3);//nonpool
      
      //different ref
     /* String a=new String("java");
      String b=new String("java");
      System.out.println(a.compareTo(b));*/
	}

}
