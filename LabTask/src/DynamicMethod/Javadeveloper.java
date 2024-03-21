package DynamicMethod;

public class Javadeveloper extends Developer {
	
	
	public void salary()
	{
		salary=450000;
		System.out.println(" the salary of java developer:  "+salary);
	}
	public void skillSet()
	{
		skillset="java, Keyword,DataBase";
		System.out.println("Skill set of java developer: "+skillset);
	}
	public void noOfWorkingHrs()
	{
		super.noOfWorkingHrs();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Javadeveloper j=new Javadeveloper();
	    j.salary();
		j.skillSet();
		j.noOfWorkingHrs();
		
	
	}
}
