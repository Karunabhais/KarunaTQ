package Com.Over;

public class SUVCar extends Car{
	
	String engineType;
	String gearsType;
	
	public SUVCar()
	{
		 engineType=" ";
		 gearsType=" ";
	}
	public SUVCar(String carNo,String color,double price,Owner owner,String engineType,String gearsType)
	{
		super(carNo,color,price,owner);
		this.engineType=engineType;
		this.gearsType=gearsType;
	}
	public  void  setNoOfSeat(int noOfSeat)
	{
		this.noOfSeats=6;
	}
	public void calculateDis()
	{
		super.CalculateDis();
		price=price-5000;
	}
	public String toString()
	{
		return super.toString()+ " Engine_Type:  "+engineType+"  "+"Gear_Type:"+gearsType;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SUVCar obj=new SUVCar();
     Owner o1=new Owner(1, 9847737554L, "PQR");
     SUVCar obj1=new SUVCar("MH145689", "Black", 450000, o1, "Hybrid", "IMT");
     obj1.setNoOfSeat(6);
     obj1.calculateDis();
     System.out.println(obj1);
    		 
	}

}
