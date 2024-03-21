package ConstructorAssignment;

public class Account {
	private long accountNo;
	private String customerName;
	
	Account()
	{
		accountNo= 5667;
		customerName=" ABC";
		
	}
	
	
		Account(long a,String c)
		{
			accountNo=a;
			customerName=c;
			
		}
	  public void show()
	  {
		  System.out.println(accountNo +","+customerName);
	  }

	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account obj= new Account();
         obj.show();
	}

}
