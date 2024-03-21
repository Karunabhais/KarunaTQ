package Com.CollectionFramwork;

import java.util.ArrayList;

//WAP to retrieve an element (at a specified index) from a given ArrayList
public class RetriveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> obj=new ArrayList<>();
      obj.add("Red");
      obj.add("Orange");
      obj.add("white");
      obj.add("black");
      System.out.println(obj);
      System.out.println(" the element at index 3 im the arraylist: " +obj.get(3));
	}

}
