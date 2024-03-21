package Constructor;

public class Employee {
    private int id,deptNo;
    private String empname;
    private  double basicsalary,pf,da,hra,netsal;
    
    Employee()
    {
    	System.out.println("In default Consturctor");
    }
     Employee(int id ,int deptNo,String empname,double basicsalary)
     {
    	 System.out.println("Parametrized constructor");
    	 this.id=id;
    	 this.empname=empname;
    	 this.basicsalary=basicsalary;
    	 this.deptNo=deptNo;
     }
     public void setId(int id )
     {
    	 this.id=id;
     }
     public void setEmpName(String empName)
     {
    	 this.empname=empName;
     }
     public void setBasicsalary( double basicsalary)
     {
    	 this.basicsalary=basicsalary;
     }
     public void setDeptNo(int deptNo)
     {
    	 this.deptNo=deptNo;
     }
     public int getId()
     {
    	 return id;
     }
     public String getEmpname()
     {
    	 return empname;
    	 
     }
     public double getBasicsalary()
     {
    	 return basicsalary;
     }
     public int getDeptNo()
     {
    	 return deptNo;
     }
     
    public void CalculateSal()
    {
    	pf=basicsalary*0.10;
    	hra=basicsalary*0.15;
    	 netsal=basicsalary*0.10;
    	 
    }
    public void displayEmp()
    {
    	System.out.println("Emp id="+id);
    	System.out.println("Emp Name="+empname);
    	System.out.println("DeptNo="+deptNo);
    	System.out.println("Basic sal="+basicsalary);
    	System.out.println("Net salary="+netsal);
    	
    }
    	
    
   public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee obj=new Employee();
      //Employee obj1=new Employee(1,12,"K",5600);
      obj.setId(1);
      obj.setEmpName("S");
      obj.setDeptNo(21);
      obj.setBasicsalary(45000);
      obj.CalculateSal();
      obj.displayEmp();
      Employee obj1=new Employee(1,12,"K",5600);
      obj1.CalculateSal();
      obj1.displayEmp();
      
      
      
	}

}
