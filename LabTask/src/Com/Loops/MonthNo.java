package Com.Loops;

import java.util.Scanner;

public class MonthNo {
	 static Scanner sc=new Scanner(System.in);
	public void Month( int mno) {
		switch (mno)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println("Month has 31 days");
		       break;
		case 2: System.out.println("Enter year");
		         int year=sc.nextInt();
		         
		         if((year%4==0 && year%100!=0) ||(year%400==0))
		            {
			          System.out.println("Momth has 29 days");
		            }
		else
		{
			  System.out.println("Month has 28 days");
		}
		         break;
		         
		case 4:
		case 6:
		case 9:
		case 11:System.out.println("Month has 30 days");
		          break;
		          
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
        MonthNo obj=new MonthNo();
        System.out.println("Enter Month");
        int mno=sc.nextInt();
        obj.Month(mno);
        
		
     }  
	}


