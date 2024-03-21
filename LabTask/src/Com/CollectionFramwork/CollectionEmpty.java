package Com.CollectionFramwork;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Collection<Integer> collection = new ConcurrentLinkedQueue<Integer>();  
	        //returns true if the queue is empty  
	        if(collection.isEmpty()){  
	            System.out.println("The queue is empty.");  
	        }  
	        else{  
	            System.out.println("Elements are : "+collection);  
	}

}
}
