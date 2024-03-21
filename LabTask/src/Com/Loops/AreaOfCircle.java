package Com.Loops;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   Scanner s=new Scanner(System.in);
           
           System.out.println("MENU:");
           System.out.println("1.Area of a Circle");
           System.out.println("2.Area of a Square");
           System.out.println("3.Area of a Right Angled Triangle");
           System.out.println("4.Area of a Rectangle");
           System.out.println("5.Circumference of a Circle");
           System.out.println("6.Perimeter of a Square");
           System.out.println("7.Exit");

           System.out.println("Enter your option:");
           int op=s.nextInt();

           switch(op)
           {
                 case 1: System.out.println("Enter radius:");
                             float r=s.nextFloat();
                             float ac=3.14f*r*r;
                            System.out.println("Area:"+ac);
                            break;

                case 2: System.out.println("Enter side:");
                             int x=s.nextInt();
                             int as=x*x;
                            System.out.println("Area:"+as);
                            break;

                case 3: System.out.println("Enter height and base:");
                             float h=s.nextFloat();
                             float bs=s.nextFloat();
                             float art=0.5f*h*bs;
                             System.out.println("Area:"+art);
                             break;

                case 4: System.out.println("Enter length and breadth:");
                              int l=s.nextInt();
                              int b=s.nextInt();
                              int ar=l*b;
                             System.out.println("Area:"+ar);
                             break;

               case 5: System.out.println("Enter radius:");
                              float R=s.nextFloat();
                              float C=3.14f*2f*R;
                             System.out.println("Circumference:"+C);
                             break;


                case 6: System.out.println("Enter side:");
                              int X=s.nextInt();
                              int p=4*X;
                             System.out.println("Perimeter:"+p);
                             break;

                 default:((Object) System.out).wait(0);
	}

}
}
