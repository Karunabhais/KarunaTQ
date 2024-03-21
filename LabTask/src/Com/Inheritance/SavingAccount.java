package Com.Inheritance;

public class SavingAccount extends Account {
      int rate;
      int panNo;
     
      public SavingAccount()
      {
    	 // super();
    	 // rate=0;
    	  //panNo=0;
      }
      public SavingAccount(int accNo,String name,double bal,int rate,int pn)
      {
    	  super(accNo,name,bal);
    	  this.rate=rate;
    	  this.panNo=pn;
      }
     
	public void CheckBalance()
      {
    	 balance+=((balance*rate)/100);
    	 System.out.println("Balance after intrest is  "+balance);
      }
      public String toString()
      {
    	  return super.toString()+" "+rate+" "+panNo;
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s=new SavingAccount();
	    SavingAccount s1=new SavingAccount(1, "Saving Account", 45000, 3400, 12345);
         //s.CheckBalance();
         System.out.println(s1);
         s1.CheckBalance();
         s1.deposit(800);
         s1.withdraw(400);
         //SavingAccount s1=new SavingAccount
       
	}

}
