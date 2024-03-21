package DynamicMethod;

public class BackEndDeveloper extends Developer{
	public void salary()
	{
		salary=450000;
		System.out.println("The salary of backenddeveloper  "+salary);
		
	}
	public void skillSet()
	{
		skillset="APIs,Database,Framework,server";
		System.out.println("Skill set of backenddeveloper:  "+skillset);
	}
	public void noOfWorkingHrs()
	{
		super.noOfWorkingHrs();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackEndDeveloper bd=new BackEndDeveloper();
		bd.salary();
		bd.skillSet();
		bd.noOfWorkingHrs();
	}

}
