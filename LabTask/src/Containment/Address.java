package Containment;

public class Address {
	
	
	private String city;
	private String state;
	private String country;
	private String roadName;

	public Address(String city, String state, String country, String roadName) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.roadName = roadName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public void setRoadname( String roadName) {
		this.roadName = roadName;
	}
	public String getRoadName() {
		return roadName;
	}

	
	
	public  void show()
	{

	System.out.println(" City : " + getCity());
	System.out.println(" State : " + getState());
	System.out.println(" Country : " + getCountry());
	System.out.println(" Roadname : " + getRoadName());
	}


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address Obj = new Address("Pune", "MH", "India", "SB");
		Obj.show();
	}

}
