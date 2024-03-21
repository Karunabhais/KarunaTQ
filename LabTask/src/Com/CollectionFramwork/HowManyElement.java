package Com.CollectionFramwork;
//WAP to know how many elements in ArrayList
import java.util.ArrayList;

public class HowManyElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer>obj=new ArrayList<Integer>();
         obj.add(1);
         obj.add(2);
         obj.add(3);
         obj.add(4);
         obj.add(5);
         
         System.out.println("ArrayList:"+obj);
         int size=obj.size();
         System.out.println("Size of arraylist:"+size);
	}

}
