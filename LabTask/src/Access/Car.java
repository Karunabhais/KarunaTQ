package Access;

public class Car {
	int carNo,noOfSeat;
	double price;
	String color;
	
	Car()
	{
		carNo=0;
		noOfSeat=0;
		color=" ";
		price=0;
	}
	Car(int carNo,int nos,String color,double price)
	{
		this.carNo=carNo;
		this.noOfSeat=nos;
		this.color=color;
		this.price=price;
	}
	public Car displayDetails()
	{
		return new Car();
		
	}
	public String toString()
	{
		return "\nCar_No:"+carNo+"  "+"colour:"+color+"   "+"No__Of_Seats:" +noOfSeat+"   "+"Price:"+price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car c=new Car(1, 4, "Black", 99000);
       Car obj=c.displayDetails();
       System.out.println(obj);
       System.out.println(c);
      // c.displayDetails();
       
	}

}
