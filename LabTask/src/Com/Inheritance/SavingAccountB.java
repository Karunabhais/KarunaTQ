package Com.Inheritance;

public class SavingAccountB extends AccountO {
	 private double rate;
	 private double panNo;
	 
	 public SavingAccountB()
	 {
		 
	 }
	 public SavingAccountB(int accNo,String accName,double balance,double rate,double pn)
	 {
		 super(accNo,accName,balance);
		 this.panNo=pn;
		 this.rate=rate;
		 
	 }
	 
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
