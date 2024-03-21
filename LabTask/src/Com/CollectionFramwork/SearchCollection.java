package Com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

//WAP to search an   specific collection an this collection
public class SearchCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 
	        // Adding values to the initial list
	        list.add(1);
	        list.add(2);
	        list.add(3);
	 
	        // Printing the initial list
	        System.out.println(
	            "Initial collection value of list: " + list);
	 
	        // creating object of the specified list.
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	 
	        list2.add(4);
	        list2.add(5);
	        list2.add(6);
	 
	        // Printing the initial list
	        System.out.println(
	            "Initial collection value of list2: " + list2);
	        boolean b = list.addAll(2, list2);
	        
	        // printing the boolean result
	        System.out.println("Boolean Result: " + b);
	 
	        // printing the final list with the new values added
	        System.out.println(
	            "Final collection value of list: " + list);
	 
	        // creating an object for a different collection
	 
	        Integer[] arr = new Integer[4];
	 
	        // Initializing the array
	        arr[0] = 9;
	        arr[1] = 8;
	        arr[2] = 7;
	        arr[3] = 6;
	        // Adding array elements to list2
	        Collections.addAll(list2, arr);
	 
	        // Printing the new List2
	        System.out.println(
	            "Final collection value of list2: " + list2);
	}

}
