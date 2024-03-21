package Com.CollectionFramwork;

import java.util.ArrayList;

//WAP to empty ArrayList
public class EmptyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> language=new ArrayList<>();
       language.add("java");
       language.add("python");
       System.out.println("Original arraylist:"+language);
       
       language.removeAll(language);
       System.out.println("Empty arraylist:"+language);
	}

}
