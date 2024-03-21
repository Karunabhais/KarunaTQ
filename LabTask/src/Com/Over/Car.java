package Com.Over;

public class Car  {
	int noOfSeats;
	String colour, carNo;
	double price;
	Owner owner;
	
	Car()
	{
		carNo=" ";
		//noOfSeats=0;
		colour=" ";
		price=0;
	}
	public Car(String cn, String colour,double price,Owner owner)
	{
		this.carNo=cn;
		//this.noOfSeats=nos;
		this.colour=colour;
		this.price=price;
	}
	public void  setCarSeats(int noOfSeat)
	{
		this.noOfSeats=4; 
	}
	public void CalculateDis()
	{
		double discount =price*0.1;
		price=price -discount;
	}
	public String toString()
	{
		return owner+"\nCar_No:"+carNo+"  "+"colour:"+colour+"   "+"No__Of_Seats:" +noOfSeats+"   "+"Price:"+price;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car obj=new Car();
      Owner o1=new Owner(1, 1234567967, "ABC");
      
      Car obj1= new Car("MH149115",  "White",34000,o1);
      obj1.setCarSeats(4);
      obj1.CalculateDis();
      System.out.println(obj1);
    
	}

}
