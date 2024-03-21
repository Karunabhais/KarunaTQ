package Com.map;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String>hl=new HashMap<Integer, String>();
        hl.put(1, "java");
        hl.put(2, "python");
        hl.put(3, "C++");
        
        System.out.println(hl.put(1, "sql"));
        System.out.println(hl.put(5, "SBoot"));
        


	}

}
