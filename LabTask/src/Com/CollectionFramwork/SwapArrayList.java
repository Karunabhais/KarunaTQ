package Com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ArrList = new ArrayList<String>();
		 
        // add the values in Array List
        ArrList.add("Item 1");
        ArrList.add("Item 2");
        ArrList.add("Item 3");
        ArrList.add("Item 4");
        ArrList.add("Item 5");
 
        // display Array List before swap
        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
 
        // Swapping the elements at 1 and 2 indices
        Collections.swap(ArrList, 1, 2);
 
        // display Array List after swap
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);
    }
	
}
