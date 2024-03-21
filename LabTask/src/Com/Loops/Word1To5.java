package Com.Loops;

import java.util.Scanner;

public class Word1To5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int i;
        System.out.println(" Enter the number from 1to 5");
        i=sc.nextInt();
        switch(i)
        {
        case 1: System.out.println("one");
	             break;
        case 2:System.out.println("Two");
		         break;
        case 3: System.out.println("Three");
                 break;
        case 4: System.out.println("Four");
                 break;
        case 5: System.out.println(" Five");
                 break;
                 
        
        default:
        {
        	 System.out.println( "You not entered no in range 1 to 5");
        	 
        }
	}

	}
}
