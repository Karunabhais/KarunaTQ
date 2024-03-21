package Test5Q;

public class Bank {
	private static String bname="HDFC bank";
	String banklocker;
	String ifscCode;
	String accname;
	int accno;
	{
		banklocker="satara";
		ifscCode="HDFCCODE2114";
	}
	Bank()
	{
		
	}
	Bank(int accno,String name){
		this.accname=name;
		this.accno=accno;
	}
	void displayBankdetails()
	{
		System.out.println("Bank name:"+banklocker);
		System.out.println("Code "+ifscCode);
	}
	class Locker{
		int lockerid;
		String pass;
		
		public Locker() {
			// TODO Auto-generated constructor stub
		}
		public Locker(int lid,String pass) {
			this.lockerid=lid;
			this.pass=pass;
		}
		public void displayLockerDetails()
		{
			System.out.println(accno+" "+accname);
			System.out.println("Locker Id "+lockerid);
			System.out.println("Locker pass: "+pass);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bank b=new Bank(101, "sushant");
      // b.displayBankdetails();
       Bank.Locker locker=b.new Locker(102, "ks123");
       b.displayBankdetails();
       System.out.println("*************************");
       locker.displayLockerDetails();
       
       System.out.println("*******************");
       Bank.Locker locker2=new Bank(103, "dhruv").new Locker(104,"d123");
       locker2.displayLockerDetails();
	}

}
