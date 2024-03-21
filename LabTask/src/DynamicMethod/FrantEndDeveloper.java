package DynamicMethod;

public class FrantEndDeveloper extends Developer {
	
	public void salary()
	{
		salary=200000;
		System.out.println("The salary of frantenddeveloper "+salary);
		
	}
	public void skillSet()
	{
		skillset="HTML,PHP,Javascript,Css";
		System.out.println("Skill set of frantenddeveloper: "+skillset);
	}
	public void noOfWorkingHrs()
	{
		super.noOfWorkingHrs();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrantEndDeveloper fd=new FrantEndDeveloper();
		fd.salary();
		fd.skillSet();
		fd.noOfWorkingHrs();
		
	}

}
