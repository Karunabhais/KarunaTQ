package Containment;


	public class PerAddr{

		private String city;
		private String state;
		private String country;
		private String roadName;

		PerAddr(String city, String state, String country, String roadName) {
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

		public String getRoadName() {
			return roadName;
		}

		public void setRoadName(String roadName) {
			this.roadName = roadName;
		}

	
	
	public static class Person {
		private int personId;
		private String personName;
		PerAddr addrObj;

		public Person(int personId, String personName) {
			this.personId = personId;
			this.personName = personName;
		}

		public int getPersonId() {
			return personId;
		}

		public void setPersonId(int personId) {
			this.personId = personId;
		}

		public String getPersonName() {
			return personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

	
    public static void display(Person personObj){
		
		System.out.println("Person Id : " + personObj.getPersonId());
		System.out.println("Person Name : " + personObj.getPersonName());
		System.out.println("Person City : " + personObj.addrObj.getCity());
		System.out.println("Person State : " + personObj.addrObj.getState());
		System.out.println("Person Country : " + personObj.addrObj.getCountry());
		System.out.println("Person Road : " + personObj.addrObj.getRoadName());
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person personObj = new Person(101, "Kiran");
		
		personObj.addrObj = new PerAddr("Pune", "MH", "India", "SB");
		
		display(personObj);

	

	}

	}
	}
