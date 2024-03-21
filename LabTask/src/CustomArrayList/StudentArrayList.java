package CustomArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Student> srr=new ArrayList<Student>();
      srr.add(new Student(101, "karuna", 34));
      srr.add(new Student(102, "kajal",  75));
      srr.add(new Student(103, "Urmila", 55));
      srr.add(new Student(104, "varsha", 98));
      //srr.add(new Student(105, "sai",    87));
     // srr.add(new Student(106, "karuna", 74));
      
      Iterator<Student>itr=srr.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      System.out.println("                     ");
      
      Iterator<Student>itr1=srr.iterator();
      while(itr1.hasNext())
      {
    	  Student s=itr1.next();
    	  if(s.getMarks()<=70)
    	  {
    		  System.out.println("Student are pass:"+s);
    	  }
      }
      
      System.out.println("                   ");
      
     
      
    	  Student st=new Student();
    	  float maxmark=0;
    	  for(Student s:srr)
    	  {
    		  if(s.getMarks()>maxmark)
    		  {
    			  st=s;
    			  maxmark=s.getMarks();
    		  }
    		  
    	    }
	       
    	     System.out.println("topper is:"+st);
    	     
    	     System.out.println("***************************");
        
             Iterator<Student> itr2=srr.iterator();
              while(itr2.hasNext())
              {
            	  Student s=itr2.next();
            	  String grade=" ";
            	  if(s.getMarks()>=90 && s.getMarks()<100)
            	  {
            		  grade="A+";
            		 // System.out.println("grade is:"+grade+"A");
            	  }
            	  else if(s.getMarks()>=80 && s.getMarks()<90)
            	  {
            		  grade="A";
            	  }
            	  else if(s.getMarks()>=70 && s.getMarks()<80)
            	  {
            		  grade="B+";
            		 // System.out.println("grade is:"+grade+"B");
            	  }else if(s.getMarks()>=60 && s.getMarks()<70)
            	  {
            		  grade="B";
            	  }else if(s.getMarks()>=50 && s.getMarks()<60)
            	  {
            		  grade="C+";
            	  }
            	 else if(s.getMarks()>=40 && s.getMarks()<50)
            	 {
            		 grade="C";
            	  }
            	 else
            	 {
            		 grade="fail";
            	 }
            	  //System.out.print("greader is:"+srr);
                  System.out.println(itr2.next());
              }
	}
}
            	  
              
        
        
   

