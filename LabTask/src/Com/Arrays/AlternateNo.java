package Com.Arrays;

public class AlternateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {1,2,3,4,5,6,7};
      
      int n=arr.length;
      for(int i=0;i<arr.length;i=i+2)
      {
    	  System.out.println(arr[i]);
      }
	}

}
