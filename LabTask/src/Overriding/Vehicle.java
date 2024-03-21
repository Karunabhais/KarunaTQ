package Overriding;

public class Vehicle {
	void run()
	{
		System.out.println("Vehicle is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vehicle v=new Vehicle();
      //System.out.println(v);
    v.run();
	}

}
