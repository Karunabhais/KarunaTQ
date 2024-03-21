package Com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import Com.CollectionFramwork.ArrayListItrator;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String, Double> student=new HashMap<String, Double>();
      student.put("priya", 89.9);
      student.put("karuna", 98.5);
      student.put("urmila", 67.8);
      student.put("varsha", 75.7);
      student.put("sheetal", 65.4);
      
      System.out.println(student);
      System.out.println("using  itrator keyset() and itrator");
       Set<String>set=student.keySet();
       Iterator<String>itr=set.iterator();
       while(itr.hasNext())
       {
    	   String s=itr.next();
    	   System.out.println(s+" "+student.get(s));
    	   
       }
       //entryset itrator
       System.out.println("using entryset itrator");
       Set<Entry<String,Double>>entry=student.entrySet();
       Iterator<Entry<String,Double>>itr1=entry.iterator();
       while(itr1.hasNext())
       {
    	   Entry<String,Double>en=itr1.next();
    	   System.out.println(en.getKey()+" "+en.getValue());
    	   
       }
       System.out.println("Using itration enhance forloop and entryset");
       for(Entry<String,Double>e:entry)
       {
    	   System.out.println(e.getKey()+" "+e.getValue());
       }
       
       
      
      
      
	}

}
