package Com.Interface;

public class TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bank b=new SBI();
     // b.rateOfInterest();
      System.out.println("ROI:"+b.rateOfInterest());
      
      Bank b1=new PNB();
      System.out.println("ROT:"+b1.rateOfInterest());
      
	}

}
