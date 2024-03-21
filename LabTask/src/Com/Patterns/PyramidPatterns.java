
    /*
     *     
           1

     *    2 3
     *   4 5 6
     *  7 8 9 10
     */




package Com.Patterns;

public class PyramidPatterns {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
	    int rows = 4;
		
		for(int i = 1;i <= rows ;i++)
		{
			for(int j = 4;j <= rows ;j++)
			{
			System.out.print("  ");
			}
			
			for(int k = 1;k <= i;k++)
			{
				System.out.print(num+" ");
				num++;
			}
		  System.out.println();
     	
			}
		}
		
}


