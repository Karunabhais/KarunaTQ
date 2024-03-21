package Com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//WAP to match two collections
public class CollectionCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> listA = new ArrayList<>(Arrays.asList("a", "b", "c")); 

     // create listB 
     ArrayList<String> listB  = new ArrayList<>(Arrays.asList("a", "c", "b")); 

     // sorting both lists 
     Collections.sort(listA); 
     Collections.sort(listB); 

     // Compare lists using 
     // equals() method 
     boolean isEqual = listA.equals(listB); 

     // print output on screen (true or false) 
     System.out.println(isEqual);
	}

}
