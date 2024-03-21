package AssignmentHashMap;

import java.util.HashMap;
import java.util.Map;

public class ItratortheAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String>map=new HashMap<Integer, String>();
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Orange");
        
        System.out.println(map);
        for(Map.Entry<Integer,String>set:map.entrySet())
        {
        	System.out.println(set.getKey()+" "+set.getValue());
        }
	}

}
