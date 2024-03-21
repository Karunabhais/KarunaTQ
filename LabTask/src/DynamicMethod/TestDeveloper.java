package DynamicMethod;

public class TestDeveloper  extends Javadeveloper{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		FrantEndDeveloper f=new FrantEndDeveloper();
		Javadeveloper j=new Javadeveloper();
		BackEndDeveloper b=new BackEndDeveloper();
		
		Developer ref;
		ref=d;
		ref.salary();
		ref.noOfWorkingHrs();
		ref.skillSet();
		
		FrantEndDeveloper ref1;
		ref=f;
		ref.salary();
		ref.skillSet();
		ref.noOfWorkingHrs();
		
		Javadeveloper ref2;
		ref=j;
		ref.salary();
		ref.skillSet();
		ref.noOfWorkingHrs();
		
		BackEndDeveloper ref3;
		ref=b;
		ref.salary();
		ref.skillSet();
		ref.noOfWorkingHrs();
		
		
	}

}
