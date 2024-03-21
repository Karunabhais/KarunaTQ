package AssignmentHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//import Com.CollectionFramework.Book;

public class BookMapArray {
	public static HashMap<String, ArrayList<Book>>createMap(ArrayList<Book>list)
	{
		HashMap<String,ArrayList<Book>>map=new HashMap<String, ArrayList<Book>>();
		Iterator<Book>itr=list.iterator();
		while(itr.hasNext())
		{
			Book b=itr.next();
			String s=b.getAuthor();
			if(map.containsKey(s))
			{
				ArrayList<Book>a1=map.get(s);
			    a1.add(b);
			    map.put(s, a1);
			}
			else
			{
				ArrayList<Book> b1=new ArrayList<Book>();
				b1.add(b);
				map.put(s, b1);
			}
		}
		
		return map;
	}
	public static void printmap(HashMap<String, ArrayList<Book>>map)
	{
		Set<Entry<String,ArrayList<Book>>>set=map.entrySet();
		for(Entry<String,ArrayList<Book>>e1:set)
		{
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
	}
	public static void findMaxBook(HashMap<String, ArrayList<Book>>map)
	{
		Set<Entry<String,ArrayList<Book>>>set=map.entrySet();
		Iterator<Entry<String,ArrayList<Book>>>itr1=set.iterator();
		int max=0;
		String authorName=" ";
		while(itr1.hasNext())
		{
			Entry<String, ArrayList<Book>>en=itr1.next();
			String s=en.getKey();
			ArrayList<Book>a1=en.getValue();
			if(a1.size()>max)
			{
				max=a1.size();
				authorName=s;
			}
		}
		System.out.println(authorName+"has written maximum book and count is:"+max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Book> obj=new ArrayList<Book>();
	        obj.add(new Book(105,"java","James Gosling",60));
	        obj.add(new Book(101,"python","Guido van Rossum",50));
	        obj.add(new Book(103,"C++","Bojarne Stroustrup",110));
	        obj.add(new Book(102,"C","Dennis Ritchie",   100));
	        obj.add(new Book(101,"java","James Gosling",60));
	        
	        //System.out.println(obj);
	        
	       HashMap<String,ArrayList<Book>>map= createMap(obj);
	       printmap(map);;
	       System.out.println("*************************************");
	       findMaxBook(map);
	        
	        
	}

}
