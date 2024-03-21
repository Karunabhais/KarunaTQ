package CustomArrayList;

import java.util.Iterator;

public class Student {
     private int rollno;
     private String name,grade;
     float marks;
     //private ArrayList<Double> marks=new ArraysList<Double>();
     ///private double per;
     
     Student()
     {
    	 
     }
     public Student(int rno, String name,float marks) //ArrayList<double> marks)
     {
    	 this.rollno=rno;
    	 this.name=name;
    	 this.marks=marks;
     }
    
	
	public void setRollno(int rno)
     {
    	 this.rollno=rno;
     }
     public int getRollno()
     {
    	 return rollno;
     }
     public void setName(String name)
     {
    	 this.name=name;
     }
     public String getName()
     {
    	 return name;
     }
     public void setMarks(int marks)
     {
    	 this.marks=marks;
     }
     public float getMarks()
     {
    	 return marks;
     }
    /* public void calculatePer()
     {
    	 int sum=0;
    	 Iterator<Student>itr=
     }*/
     
     
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + marks + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student obj=new Student();
       System.out.println(obj);
       
       Student obj1=new Student(101, "karuna", 78);
       System.out.println(obj); 
       
       
	}

}
