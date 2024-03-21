package Com.CollectionFramwork;
//  WAP to retain all elements from ArrayList
import java.util.ArrayList;

public class ArrayRetain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> language1=new ArrayList<>();
     language1.add("Java");
     language1.add("Python");
     language1.add("javascript");
    // language.add("C");
     System.out.println("ArrayList1: "+language1);
     
     ArrayList<String> language2=new ArrayList<>();
     language2.add("javascript");
     language2.add("java");
     language2.add("python");
   // .args language1.add("C");
     System.out.println("ArrayList2:" +language2);
     
     language1.retainAll(language2);
     System.out.println("Common element:"+language1);
	}

}
