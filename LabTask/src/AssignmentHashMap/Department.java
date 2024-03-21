package AssignmentHashMap;

import java.util.ArrayList;
import java.util.Objects;

public class Department {
	int id;
	String name;
	ArrayList<Student>arr=new ArrayList<Student>();
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(int id, String name, ArrayList<Student> arr) {
		super();
		this.id = id;
		this.name = name;
		this.arr = arr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Student> arr) {
		this.arr = arr;
	}
	public int hashCode() {
		return id;
	}
	

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		Department obj1=(Department)o;
		if(Objects.equals(id, obj1.id))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", arr=" + arr + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
       /* ArrayList<Student> arr1=new ArrayList<Student>();
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
       
       
       */
        
        
	}

}
