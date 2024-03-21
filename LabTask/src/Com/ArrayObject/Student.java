package Com.ArrayObject;

import java.util.Arrays;

public class Student {
	private static Student std;
	int id;
	String name;
	double per;
	double marks[];
	String status;
	
	Student()
	{
		
	}
	Student(int id,String name,double marks[])
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
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
	public String getStatus()
	{
		return status;
	}
	public double getPer()
	{
		return per;
	}
	
	public void calculatePer()
	{
		double sum=0;
		for(double m:marks)
		{
			sum+=m;
		}
		per=sum/5;
	}
	public void setStatus()
	{
		if(per>=40)
		{
			status="pass";
			
		}
		else
		{
			status="fail";
		}
	}
	
	public String toString()
	{
		return id+" "+name+" "+"marks"+(Arrays.toString(marks));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student sarr[]= new Student[5];
      double m1[]= {84,60,45};
      double m2[]= {90,97,89};
      double m3[]= {45,67,79};
      double m4[]= {78,70,90};
      double m5[]= {80,45,60};
      
      sarr[0]= new Student(101, "Karuna", m1);
      sarr[1]= new Student(102, "Kajal",  m2);
      sarr[2]= new Student(103, "Piya",   m3);
      sarr[3]= new Student(104, "Sai",    m4);
      sarr[4]= new Student(105, "Mayuri", m5);
      
      for(Student s:sarr)
      {
    	  s.calculatePer();
    	  s.setStatus();
    	  
      }
	 for(Student s1:sarr)
	 {
		 System.out.println("id="+s1.id+" " +"name=" +s1.name+" " +s1.getPer()+" "+s1.getStatus());
	 }
	  System.out.println("                     ");
	  for(Student s2:sarr)
	  {
		  if(s2.per>=40)
		  {
			  System.out.println(s2+" "+s2.getStatus());
		  }
	     }
	    System.out.println("                         ");
	    double first=0;
	    for(Student top:sarr)
	    {
	    	if(top.per>first)
	    	{
	    	  first=top.per;
	    	  std=top;
	    	  
	    	}
	      }
	     System.out.println("topper is="+std.name);
	     for(Student s3:sarr)
	     {
	    	 
	     }
	    }
      }
