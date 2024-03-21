package Com.CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		System.out.println(obj);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("Usinf inhance for loop");
		for(int e :obj)
		{
			System.out.println(e +" ");
		}
		System.out.println("Using iterator");
		Iterator<Integer>itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
