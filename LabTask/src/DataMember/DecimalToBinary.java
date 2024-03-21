package DataMember;

public class DecimalToBinary {
	
	public static class DecimalToBinarya {
		  
		  static void convertDecimal(int n)
		  {
		      String dNum="";
		    while(n>0)
		    {
		      int rem= n%2;
		    //  System.out.println(rem);
		      n/=2;
		      dNum=dNum+rem;
		      
		    }
		    
		    //System.out.println(dNum);
		    reverseNum(dNum);
		    
		  
		  }
		  
		  static void reverseNum(String num)
		  {
		    String decimalNum="";
		    for(int i=num.length()-1;i>=0;i--)
		    {
		      decimalNum+= num.charAt(i); 
		    }
		    
		    int dNum= Integer.parseInt(decimalNum);
		    
		    System.out.println(dNum);
		  }
		  }

		 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    
			    int num=16;
			    convertDecimal(num);
			    
	}
			    private static void convertDecimal(int num) {
		// TODO Auto-generated method stub
		
	}
				static void decToBinary(int n) 
			    { 
			        // Size of an integer is assumed to be 8 bits 
			        for (int i = 8; i >= 0; i--) { 
			            int k = n >> i; 
			            if ((k & 1) > 0) 
			                System.out.print("1"); 
			            else
			                System.out.print("0"); 
	}

}
}
