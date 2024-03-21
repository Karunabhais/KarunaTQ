package DynamicMethod;

public class Developer {
	int salary;
	String skillset;
	float workhrs;
	
	public void salary()
	{
		salary=45000;
		System.out.println("the salary of develpoer: "+salary);
	}
	public void skillSet()
	{
		skillset="Logical,understanding,Communication";
		System.out.println("Skill set of developer"+skillset);
		
	}
	public void noOfWorkingHrs()
	{
		workhrs= 6;
		System.out.println("working hours are: "+workhrs);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Developer d=new Developer();
        d.skillSet();
        d.salary();
        d.noOfWorkingHrs();
	}

}
