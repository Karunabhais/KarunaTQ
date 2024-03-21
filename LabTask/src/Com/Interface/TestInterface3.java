package Com.Interface;

public class TestInterface3 implements Printable,Showable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface3 t=new TestInterface3();
		t.print();
		t.show();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am in Interface");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
