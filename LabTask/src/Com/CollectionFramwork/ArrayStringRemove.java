package Com.CollectionFramwork;

import java.util.ArrayList;
// WAP to remove element from ArrayList
//WAP to remove all elements from ArrayList
public class ArrayStringRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<String> str=new ArrayList<String>(4);
       str.add("abc");
       str.add("pqr");
       str.add("fgh");
       str.add("tyhj");
       
       System.out.println("the list of size is:"+str.size());
       
       for(String name:str)
       {
    	   System.out.println("Name is:"+name);
       }
       str.removeAll(str);//str.remove("pqr);
       System.out.println("After removing the element "+str.size());
       
       for(String name: str)
       {
    	   System.out.println("Name is"+name);
       }
       
       
       
	}

}
