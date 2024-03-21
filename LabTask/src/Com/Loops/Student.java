package Com.Loops;

import java.util.Scanner;

public class Student {
	    int sid,perc;
	    float total;
	    String sname,grade;
	    int math,phy,eng,comp,elec;
	    
		
	    public  void setData()
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter  name");
	    	sname=sc.next();
	    	System.out.println("Enter sid");
	    	sid=sc.nextInt();
	    	
	    	System.out.println("Enter marks in Maths, Physics, English:");
	    	math=sc.nextInt();
	          phy=sc.nextInt();
	          eng=sc.nextInt();
	    	
	         //int total=math+eng+phy;
	          //float perc=(float)total/300*100;
	    	
	    }
	      public void calculatePer()
	      {
	    	  //Scanner sc=new Scanner(System.in);
	    	 
			//float per=total/5;
			//System.out.println("Total:"+total);
			//System.out.println("precentage:"+per);
	    	  
			 int total=math+eng+phy;
	         float perc=(float)total/300*100;
	    	
	          
	          
	          System.out.println("Student id:  "+sid );
	          System.out.println("Student Name: "+sname);
	         
	          System.out.println("Marks (Maths, Physics, English): " +math+","+phy+","+eng);
	          System.out.println("Total: "+total);
	          System.out.println("Percentage: "+perc);
	          
	      }
	      
	      
	      
	  public void calculategrade()
	    
	    {
	      
		if(perc>=90)
	    	  System.out.println("Grade A");
		else if( perc<=80)
			System.out.println("Grade B");
		else if(perc>=70)
			System.out.println("Grade C");
		else if (perc>=60)
			System.out.println("Grade D");
		else if(perc>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
		
			
	    	  
	   }
	// public void show()
	 //{
		//  System
	 //}
	 
	 
	 
	 
	 
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student obj=new Student();
	
	
	  obj.setData();
	  obj.calculatePer();
	  obj.calculategrade();

	}

}
