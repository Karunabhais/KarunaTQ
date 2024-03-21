package Com.Over;

public class Owner {
	
	  int id;
	  String name;
	  long phoneNo;
	  
	 Owner()
	 {
		 id=0;
		 name=" ";
		 phoneNo=0;
		 
	 }
	 public Owner(int id,long pn,String name)
	 {
		 this.id=id;
		 this.name=name;
		 this.phoneNo=pn;
	 }
	 public void show()
	 {
		 System.out.println("Id=   "+id);
		 System.out.println("Name= "+name );
		 System.out.println("PhoneNo= "+phoneNo);
		 
	 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Owner o=new Owner();
        o.show();
        
        Owner o1=new Owner(1, 1234556789, "XYZ");
        o1.show();
	}

}
