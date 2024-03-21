package Containment;

public class Person {
	
		
		
		private int personId,age;
		private String personName,gender,Address;
		
		//public Person(int personId2, String string, String personName2, int i, String address) {
			// TODO Auto-generated constructor stub
		//}

		/*Person()
		{
			System.out.println("Default");
			personId=2;
			personName="K";
			
		}*/
		

		public Person(int personId,int age, String personName,String gender,String Address) {
			this.personId = personId;
			this.personName = personName;
			this.gender=gender;
			this.age=age;
			this.Address=Address;
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
		public void setGender(String gen) {
			this.gender=gen;
		}
		public String getGender() {
	          return gender;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void setAddress(String addr) {
			this.Address=addr;
		}
		public String getAddress(){
	       return Address;
		}

		public void display(){
			

			System.out.println("Person Id : " + getPersonId());
			System.out.println("Person name : " + getPersonName());
			System.out.println("Person Address : " + getAddress());
			System.out.println("Person age:       " + getAge());
			System.out.println("Person Gender : " + getGender());
			
			}



	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person  Obj = new Person(101, 25,"Pune","Karuna","female");
	     Obj.display();
	    // Person obj1=new Person();
	     //obj1.display();



	}

	
	}


