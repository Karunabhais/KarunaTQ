package Access;

public class SUV extends Car{
	
	String engType,gearType;
	
	SUV()
	{
		
	}
	 SUV(int carNO,int nos,String color,double price,String engType,String gearType)
	 {
		 
	  super(carNO,nos,color,price);
	  this.engType=engType;
	  this.gearType=gearType;
	 } 
	 public SUV displayDetails()
	 {
		 return new SUV();
	 }
	 public String toString()
	 {
		 return super.toString()+" Engine_Type:  "+engType+"  "+"Gear_Type:"+gearType;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SUV s=new SUV(1, 4, "White", 23000, "Pqr", "Normal");
      s.displayDetails();
      SUV obj=s.displayDetails();
      System.out.println(obj);
      System.out.println(s);
     // System.out.println();
	}

}
