package Com.CollectionFramwork;

import java.util.ArrayList;

// WAP to test an ArrayList is empty or not
public class EmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> language=new ArrayList<String>();
      boolean result=language.isEmpty();
      System.out.println("is the arraylist is empty:"+result);
      
     // ArrayList<String> language1=new ArrayList<String>();
      language.add("Java");
      language.add("C");
      System.out.println("Is update arraylist"+language);
      result=language.isEmpty();
      System.out.println("is the arraylist empty:"+result);
	}

}
