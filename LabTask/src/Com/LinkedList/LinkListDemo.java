package Com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

//import Com.CollectionFramwork.ArrayListItrator;

public class LinkListDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList<String> str=new LinkedList<String>();
        str.add("priya");
        str.add("karuna");
        str.add("kajal");
        str.add("urmila");
        str.add("varsha");
        
        System.out.println(str);
        System.out.println("*****add Element****");
        str.add("sandhya");
        System.out.println(str);
        
        System.out.println("*****addfirst Element*****");
        str.addFirst("trups");
        System.out.println(str.getFirst());
        System.out.println(str);
        
        System.out.println("*****addlast element*****");
        str.addLast("sheetal");
        System.out.println(str.getLast());
        System.out.println(str);
        
        System.out.println("**Index off***");
       // str.indexOf("madhuri");
        System.out.println("index of madhuri:"+str.indexOf("madhuri"));
        System.out.println(str);
        
        System.out.println("***Last indexoff****");
        System.out.println("lastindexoff:"+str.lastIndexOf("kajal"));
        System.out.println(str);
        
        System.out.println("****remove first****");
        str.removeFirst();
        System.out.println(str);
        
        System.out.println("****Remove last****");
        str.removeLast();
        System.out.println(str);
        
        System.out.println("***using contains***");
        System.out.println("does the contain :"+str.contains("urmila"));
       //System.out.println(str);
        
        System.out.println("****Usling itrator***");
        Iterator<String>itr=str.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        System.out.println();
        
        System.out.println("Using enhance for loop");
        for(String list:str) {
        	System.out.println(list +" ");
        }
        System.out.println();
        
        System.out.println("Using for loop");
        for(int i=0;i<str.size();i++)
        {
        	System.out.println(str.get(i) + " ");
        	//System.out.println(str);
        }
        
	}
	

}
