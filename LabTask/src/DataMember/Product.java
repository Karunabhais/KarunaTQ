package DataMember;

import java.util.Scanner;

public class Product {
	
	 
	  int prodid;
	  String name,description;
	  double price,discount;
	  int quantity;
	  
	  public void setdata()
	  {
		 
		  
			 Scanner sc=new Scanner(System.in);
			 System.out.println( "Enter Product ID");
			 prodid=sc.nextInt();
			 System.out.println("enter product name");
			 sc.nextLine();
			 name=sc.next();
			 System.out.println("enter product Description");
			 sc.nextLine();
			 description=sc.next();
			 System.out.println("enter product quantity");
			 sc.nextLine();
			 quantity = sc.nextInt();
			 sc.close();
	      } 
		   public  void calculatorTotalPrice()
		   {
			   price=quantity*2500;
			   
		   }  
			 public void calculatorDiscountPrice()
			  {
				  if(price>=3000)
					  discount=price-200;
				  else if (price>=4000)
					  discount=price-300;
				  else if (price>=5000)
					  discount=price-400;
			  }
			 public void displayProduct()
			 {
				System.out.println("Your product Id is:"+prodid);
				System.out.println("Your product Name is:"+name);
				System.out.println("Your product Discription is:"+description);
				System.out.println("Your product quantity is:"+quantity);
				System.out.println("Your product Total Price is:"+price);
				System.out.println("Your product Total Discount Price is:"+discount);
				
				
			 }
		 
	  
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product obj=new Product();
        obj.setdata();
        obj.calculatorTotalPrice();
        obj.calculatorDiscountPrice();
        obj.displayProduct();
        
	}

}
