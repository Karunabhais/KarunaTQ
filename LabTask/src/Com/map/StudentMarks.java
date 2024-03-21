package Com.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//import Com.CollectionFramwork.ArrayListItrator;

public class StudentMarks {
	public static void checksubject(HashMap<String,ArrayList<String>>sk)
	{
		Set<Entry<String, ArrayList<String>>> entry=sk.entrySet();
		Iterator<Entry<String, ArrayList<String>>> itr=entry.iterator();
		while(itr.hasNext())
		{
			Entry<String, ArrayList<String>>  e=itr.next();
			String key=e.getKey();
			ArrayList<String> value=e.getValue();
	    	   for(String s:value)
	    	   {
	    		   if(s.equalsIgnoreCase("french"))
	    		   {
	    			   System.out.println(key);
	    		   }
	    	   }
	       }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,ArrayList<String>> sub=new HashMap<String,ArrayList<String>>();
       ArrayList<String>a1=new ArrayList<String>(Arrays.asList("marathi","Hindi","English"));
       sub.put("karuna", a1);
       
       ArrayList<String>a2=new ArrayList<String>(Arrays.asList("science","Hindi","french"));
       sub.put("varsha", a2);
       
       ArrayList<String>a3=new ArrayList<String>(Arrays.asList("marathi","maths","history"));
       sub.put("tejal", a3);
       
       ArrayList<String>a4=new ArrayList<String>(Arrays.asList("java","french","English"));
       sub.put("urmila", a4);
       
       Set<Entry<String,ArrayList<String>>>entry=sub.entrySet();
       Iterator<Entry<String,ArrayList<String>>>itr=entry.iterator();
       while(itr.hasNext())
       {
    	   Entry<String,ArrayList<String>>en=itr.next();
    	   String key=en.getKey();
    	  // ArrayList<String>al=en.getValue();
    	   System.out.println(en.getKey()+" "+en.getValue());
    	   
       }
       System.out.println("********************************");
       checksubject(sub);
       //for subject french
      /* Iterator<Entry<String,ArrayList<String>>>itr1=entry.iterator();
       while(itr1.hasNext())
       {
    	   Entry<String,ArrayList<String>>en=itr1.next();
    	   for(String s:en.getValue())
    	   {
    		   if(s.equals("french"))
    		   {
    			   System.out.println(en.getKey());
    		   }
    	   }
    	   
       }*/
       
	}

}
