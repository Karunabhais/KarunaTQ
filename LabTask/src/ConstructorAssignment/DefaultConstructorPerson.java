package ConstructorAssignment;

public class DefaultConstructorPerson {
	String  firstName,lastName;
	int age;
	
	DefaultConstructorPerson(String firstName,String lastName,int age)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		System.out.println("I am in Parametrized  constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructorPerson obj=new DefaultConstructorPerson("asd","pre", 45);
		//obj.firstName="K";
		//obj.lastName="S";
		//obj.age=25;
		System.out.println(obj.age);
		System.out.println(obj.firstName);
		System.out.println(obj.lastName);
	}

}
