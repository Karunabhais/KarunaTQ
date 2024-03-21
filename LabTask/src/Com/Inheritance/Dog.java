package Com.Inheritance;

public class Dog extends Animal {
	
	void bark()
	{
		System.out.println("barking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Dog d=new Dog();
    d.bark();
    d.eat();
	}

}
