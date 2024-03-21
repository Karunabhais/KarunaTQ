package Com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
	public static void printTotalSal(ArrayList<Employee>emp)
	{
		HashMap<Department, Double>hmap=new HashMap<>();
		
        for(Employee e:emp)
        {
        	if(hmap.containsKey(e.getDept()))
        	{
        		double totalsal=hmap.get(e.getDept());
        		totalsal=totalsal +e.getSalary();
        		hmap.put(e.getDept(), totalsal);
        		
        	}
        	else
        	{
        		hmap.put(e.getDept(), e.getSalary());
        	}
        }
			for(Map.Entry<Department, Double>e1:hmap.entrySet())
			{
				System.out.println(e1.getKey()+" "+e1.getValue());
			}
				
	}
	
	public static void  empprintHashMap(ArrayList<Employee> emp)
	
	{
		HashMap<Department, ArrayList<Employee>>hmap=new HashMap<Department, ArrayList<Employee>>();
		ArrayList<Employee> elist;
		for(Employee e:emp)
		{
			if(hmap.containsKey(e.getDept()))
			{
				elist=hmap.get(e.getDept());
				elist.add(e);
				hmap.put(e.getDept(), elist);
				
			}
			else
			{
				elist=new ArrayList<Employee>();
				elist.add(e);
				hmap.put(e.getDept(), elist);
			}
		}
		for(Map.Entry<Department, ArrayList<Employee>>e:hmap.entrySet())
		{
			System.out.println(e.getKey());
			for(Employee et:e.getValue())
			{
				System.out.println(et.getEid()+" "+et.getEname()+" "+et.getSalary());
			}
			System.out.println("**************************");
		}
		}
		
	   public static void empprintcount(ArrayList<Employee>emp)
	   {
		   
		HashMap<Department, Integer> hmap1=new HashMap<Department, Integer>();
		 for(Employee e:emp)
		 {
			 if(hmap1.containsKey(e.getDept()))
			 {
				 int count=hmap1.get(e.getDept());
				 count++;
				 hmap1.put(e.getDept(),count);
				 
			 }
			 else
			 {
				hmap1.put(e.getDept(),1); 
			 }
		 }
		 for(Map.Entry<Department, Integer>e:hmap1.entrySet())
		 {
			 System.out.println(e.getKey()+" : "+e.getValue());
		 }
	   }
		 
		 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Department d1=new Department(101, "IT");
      Department d2=new Department(102, "Art");
      Department d3=new Department(101, "Science");
      Department d4=new Department(102, "Admin");
      Department d5=new Department(101, "IT");
      Department d6=new Department(106, "Admin");
      Department d7=new Department(107, "Science");
      
      ArrayList<Employee> e=new ArrayList<Employee>();
      e.add(new Employee(1, "karuna", 56000, d1));
      e.add(new Employee(2, "varsha", 67000, d1));
      e.add(new Employee(3, "urmila", 89000, d3));
      e.add(new Employee(4, "Kajal", 32000, d3));
      e.add(new Employee(5, "sheetal", 67000, d5));
      e.add(new Employee(6, "Shradha", 45000, d1));
      e.add(new Employee(7, "priya", 10000, d2));
      
      
      
      printTotalSal(e);
     System.out.println("************************");
      
      empprintHashMap(e);
      System.out.println("************************");
      empprintcount(e);
      
      
      
      
	}

}
