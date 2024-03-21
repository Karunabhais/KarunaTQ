package Com.CollectionFramwork;

import java.util.ArrayList;
//WAP to iterate through all elements in an ArrayList using for loop
// WAP to iterate through all elements in an ArrayList using for each
public class IteratAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list =new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		System.out.println("Using for each ");
		for(String i:list)
			System.out.println(i);
		
		System.out.println("Usinf for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
