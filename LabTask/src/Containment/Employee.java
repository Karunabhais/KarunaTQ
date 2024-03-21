package Containment;

public class Employee {
	private int id;
	private String name;
	private double sal;
	private String deptName;
	private MyDate doj;
	
	Employee()
	{
		id=0;
		name="";
		sal=0;
		doj=new MyDate();
	}
	
   Employee(int id,String name,String deptName,double sal,MyDate doj)
   {
	   this.id=id;
	   this.name=name;
	   this.deptName=deptName;
	   this.sal=sal;
	   this.doj=doj;
	   
   }
   public void setId(int id)
   {
	   this.id=id;
   }
   public int getId()
   {
	  return id; 
   }
   public void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   public void setDeptName(String deptName)
   {
	   this.deptName=deptName;
   }
   public String getDeptName()
   {
	   return deptName;
   }
   public void setSal(double sal)
   {
	   this.sal=sal;
   }
   public double getSal()
   {
	   return sal;
   }
   public void setDoj(MyDate doj)
   {
	   this.doj=doj;
   }
   public MyDate getDoj()
   {
	   return doj;
   }
   
   public void show()
   {
	   System.out.println(id+" "+name+" "+deptName+" "+sal);
	   doj.show();
	   System.out.println("                       ");
   }
   
   
  public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee obj=new Employee();  
       //.show();
       MyDate d1=new MyDate(7,5,24);
      // Employee e2=new Employee(101," K","SIIT", 56666,new MyDate(9,2,24));
       //e2.show();
       d1.show();
       //setter and getter
       obj.setId(102);
       obj.setName("Karuna");
       obj.setDeptName("SIIT");
       obj.setSal(90000);
       obj.setDoj(new MyDate(9,2,24));
       obj.show();
       
	}

}
