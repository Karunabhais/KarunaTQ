package Ternary.com;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       double bill=10000;
       double discount;
        discount = (bill>10000) ? bill*10.0/100: bill*5.0/100;
        System.out.println(discount);
	
       
		
       
	}

}
