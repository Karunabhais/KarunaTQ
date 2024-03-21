package StaticMethods;

public class Car {
	private int  regNo;
	private String model,fueltype;
	private double price;
	private static double totalSales=0,totalRevenue=0;
	//private static int  count=1;
	
	Car()
	{
		totalSales++;
		//totalRevenue = totalRevenue+price;
	}
	
	Car(String model,String fueltype,double price, int regNo)
	{
		this();
		this.model=model;
		this.fueltype=fueltype;
		this.price=price;
		this.regNo=regNo;
		totalRevenue = totalRevenue+price;
	  
		
	
	}

	public static double getTotalSale()
	{
		return totalSales;
	}
	public static double getTotalRevenue()
	{
		return totalRevenue;
	}
	public void show()
	{
		System.out.println("Model:          "+model);
		System.out.println("Registration No "+regNo);
		System.out.println("FuleType        "+fueltype);
		System.out.println("Price           "+price);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Car obj=new Car("101","Petrol",12.5,123);
         obj.show();
         Car obj1=new Car("102","Diesel",45.5,123);
         obj1.show();
	}

}
