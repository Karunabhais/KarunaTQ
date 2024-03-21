
/*
 *       ab
 *      ababab
 *     ababababab 
 *    ababababababab
     ababababababababab

 */



package Com.Patterns;

public class AbPatterns {
	public void Patterns()
	{
		 int  n=5;
	       
	       for(int i=1;i<=n;i++)
	       {
	    	   for( int j=1;j<=(n-i);j++)
	    	   {
	    		   System.out.print(" ");
	    	   }
	    	   for(int k=1;k<=(2*i-1);k++)
	    	   {
	    		   System.out.print("ab");
	    	   }
	    	   System.out.println("");
	    	   
	    		   
	    	   
	       }   
	       }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
           AbPatterns obj=new AbPatterns();
           obj.Patterns();
    	   }
       
	}


