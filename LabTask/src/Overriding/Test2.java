package Overriding;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate uf Intrest:"+s.getOfIntrest());
        System.out.println("ICICI Rate uf Intrest:"+i.getOfIntrest());
        System.out.println("AXIC Rate uf Intrest:"+a.getOfIntrest());
	}

}
