package Ternary.com;

public class Greater2No {
	public int findMax(int n1,int n2)
	{
	int max=0;	
	
    
    max=(n1>n2)? n1:n2;
    return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greater2No obj=new Greater2No();
		System.out.println("Maximum number is "+obj.findMax(9, 51));
      
	}

}
