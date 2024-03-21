package Ternary.com;

public class Greater2Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n1=22;
     int n2=66;
     int n3=67;
     
     int res=(n1>n2 && n1>n3)? n1:((n2>n1 && n2>n3)? n2:n3);
     System.out.println(res);
	}

}
