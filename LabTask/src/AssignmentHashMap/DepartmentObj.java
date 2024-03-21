package AssignmentHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DepartmentObj {
	public static void print(HashMap<Integer,Department> map)
	{
	    Set<Entry<Integer,Department>>set=map.entrySet();
	    Iterator<Entry<Integer,Department>>itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	Entry<Integer,Department>e=itr.next();
	    	Department obj=e.getValue();
	    	ArrayList<Student>a=obj.getArr();
	    	System.out.println(e.getKey());
	    	Iterator<Student>itr2=a.iterator();
	    	while(itr2.hasNext())
	    	{
	    		System.out.println(" "+itr2.next());
	    	}
	    }
	}
	   public static void AddStudent(HashMap<Integer,Department>dep,int id,Student s)
	  {
		 if(dep.containsKey(id))
		 {
			 Department obj=dep.get(id);
			 ArrayList<Student>stu=obj.getArr();
			 stu.add(s);
			 obj.setArr(stu);
			 dep.put(obj.getId(), obj);
		 }
		 else
		 {
			 System.out.println("No Department found with"+id);
		 }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department d=new Department();
		
		 ArrayList<Student> arr1=new ArrayList<Student>();
	        arr1.add(new Student(1, "Karuna"));
	        arr1.add(new Student(2, "Varsha"));
	        arr1.add(new Student(3, "Urmila"));
	        arr1.add(new Student(4, "Shradha"));
	        
	        //ArrayList<Student>arr2=new ArrayList<Student>();
	        
	        
	       Department d1=new Department(101, "It", arr1);
	       
	       ArrayList<Student> arr2=new ArrayList<Student>();
	       arr2.add(new Student(1, "Sheetal"));
	       arr2.add(new Student(2, "Nishant"));
	       arr2.add(new Student(3, "Urmila"));
	       arr2.add(new Student(4, "Sagar"));
	       
	       Department d2=new Department(102, "CS", arr2);
	       
	       ArrayList<Student> arr3=new ArrayList<Student>();
	       arr3.add(new Student(1, "Tejal"));
	       arr3.add(new Student(2, "Trups"));
	       arr3.add(new Student(3, "Aish"));
	       arr3.add(new Student(4, "Kajal"));
	       
	       Department d3=new Department(103, "Science", arr3);
	       ArrayList<Student> arr4=new ArrayList<Student>();
	       arr4.add(new Student(1, "Priya"));
	       arr4.add(new Student(2, "Sanket"));
	       arr4.add(new Student(3, "Ashish"));
	       arr4.add(new Student(4, "Sai"));
	       
	       Department d4=new Department(104, "Art", arr4);
	       
	       HashMap<Integer,Department> map=new HashMap<Integer, Department>();
	       map.put(d1.getId(), d1);
	       map.put(d2.getId(), d2);
	       map.put(d3.getId(), d3);
	       map.put(d4.getId(), d4);
	       
	      // print(map);
	       
	       AddStudent(map, 103,new Student(45,"Jayshree"));
	       System.out.println("After adding Student list is");
	       print(map);
	}

}
