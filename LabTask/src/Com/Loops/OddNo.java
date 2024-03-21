package Com.Loops;

public class OddNo {
	public void OddNunber(int i)
	{
     int a= 200;
     int b=300;
     while(a<=b)
     {
    	 if(a%2==1)
    	 {
    		 System.out.println(a);
    	 }
    	 a=a+1;
     }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i=1;
      OddNo obj=new OddNo();
      obj.OddNunber(i);
	}

}
