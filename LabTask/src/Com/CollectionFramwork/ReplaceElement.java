package Com.CollectionFramwork;

import java.util.ArrayList;

public class ReplaceElement {
//WAP to replace the second element of an ArrayList with the specified element
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList<String>();

	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");

	    arrayList.set(1, "REPLACED ELEMENT");
	    for (String str: arrayList){
	      System.out.println(str);
	}

}
}
