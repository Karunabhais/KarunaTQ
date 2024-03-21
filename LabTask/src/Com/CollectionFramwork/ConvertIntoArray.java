package Com.CollectionFramwork;

import java.util.ArrayList;

public class ConvertIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Required packages have been imported");
	      ArrayList<String> input_list = new ArrayList<String>();
	      input_list.add("Java ");
	      input_list.add("program ");
	      input_list.add("is ");
	      input_list.add("fun");
	      System.out.println("The list is defined as:" + input_list);
	      System.out.println("\nThe result after converting to an array is:");
	      String[] result_string = input_list.toArray(new String[0]);
	      for (int i = 0; i < result_string.length; i++) {
	         String element = result_string[i];
	         System.out.print(element);
	}
	}
}
