package Com.Inheritance;

public class AccountO {
	int accNo;
	String accName;
	double balance;
	
	public AccountO()
	{
		accNo=0;
		accName=" ";
		balance=0;
	}
	public AccountO(int accNo,String name,double bal)
	{
		this.accNo=accNo;
		this.accName=name;
		this.balance=bal;
		
	}
	public void deposit(int amount )
	{
		System.out.println("\n\ndeposit method");
		System.out.println("Amount deposited="+amount);
		
	}
	public void withdraw(int amount)
	{
		if(balance-amount>0)
		{
			System.out.println("\n\n withdraw method");
			System.out.println("Amount withdraw="+amount);
			balance-=amount;
			System.out.println("Balance="+balance+"\n            ");
			
		}
		else
		{
			System.out.println("Insuffecicent balance");
		}
		System.out.println("                                           ");
		
	}
	public String toString()
	{
		return "Account Number="+accNo+"\nAccountName "+accName+"\nBalance= "+balance;
	}
		

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AccountO a=new AccountO();
     
	}

}
