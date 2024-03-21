package Com.Inheritance;

public class Account {
    
	int accNo;
    String accName;
    double balance;
    
   public Account()
    {
    	accNo=0;
    	accName="";
    	balance=0;
    }
    
    public Account(int accNo,String accName,double bal)
    {
    	this.accName=accName;
    	this.accNo=accNo;
    	this.balance=bal;
    }
    
    public void deposit(int amount)
    {
    	System.out.println("\n\nIn deposit method");
    	System.out.println("Amount deposted="+amount);
    	
    	balance+=amount;
    	System.out.println("Balance="+balance+"\n                   ");
    	
    }
    public void withdraw(int amount)
    {
    	if(balance-amount>0)
    	{
    		System.out.println("\n\nIn withdraw method");
    		System.out.println("Amount withdrawn="+amount);
    		balance-=amount;
    	}
    	else 
    	{
    		System.out.println("Insufficient balance");
    	}
    	System.out.println("                                    ");
    }
    	 public  String toString()
    	   {
    		return "Account Number="+accNo+"\nAccountName "+accName+"\nBalance= "+balance;
    	   }   	
    	
    		 
    /*public double getBalance()
    {
    	return balance;
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Account obj=new Account(101, "karuna", 45000);
       System.out.println(obj);
       obj.deposit(230);
       obj.withdraw(250);
       
       
       
       
	}

}
