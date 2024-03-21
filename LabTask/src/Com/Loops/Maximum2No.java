package Com.Loops;

import java.util.Scanner;

public class Maximum2No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner z=new Scanner(System.in);
        int a,b;
        System.out.println("Input Two Integer");
         a=z.nextInt();
         b=z.nextInt();
        switch (a=b)
        {
            case 1:
                System.out.println("maximum number " + a);
                break;
            case 2:
                System.out.println("maximum number " + b);
                break;
            default:
                System.out.println("Both are equal");
        }
	}

}
