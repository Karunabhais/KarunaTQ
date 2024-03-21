package Com.CollectionFramwork;

import java.util.ArrayList;
//WAP to create a new ArrayList, add some colors (string) and print the collection.
public class ColourElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Pink");
		list.add("White");
		list.add("Black");
		
		System.out.println(list);
		
        for(String s:list)
        	System.out.println(s);
	}

}
