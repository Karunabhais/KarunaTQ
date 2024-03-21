package Com.CollectionFramwork;

import java.util.ArrayList;

// WAP to insert an element into the ArrayList at the first position
public class FirstPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> obj=new ArrayList<>();
	      obj.add("Red");
	      obj.add("Orange");
	      obj.add("white");
	      obj.add("black");
	      System.out.println(obj);
	      
	      obj.add(0, "black");
	      //obj.add(0,"black");
	      obj.add(4, "green");
	      System.out.println(obj);
	}

}
