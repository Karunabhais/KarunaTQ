package Containment;

public class MyDate {
	
	private int dd,mm,yy;
	public MyDate() {
		System.out.println(" In default constructor of MyDate()");
		dd=mm=yy=0;
	}
	MyDate(int dd,int mm,int yy)
	{
		System.out.println("In parametric consrtuctorod of Mydate()");
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public int getDd()
	{
		return dd;
	}
	public void setDd(int dd)
	{
		this.dd=dd;
	}
	public int getMm()
	{
		return mm;
	}
	public void setMm(int mm)
	{
		this.mm=mm;
	}
	public int getYy()
	{
		return yy;
	}
	public void setYy(int yy)
	{
		this.yy=yy;
	}
	public void show()
	{
		System.out.println(dd+" "+mm+" "+yy);
	}
	public boolean equals(Object obj)
	{
		MyDate d=(MyDate)obj;
		if(this.dd==d.dd && this.mm==d.mm && this.yy==d.yy)
			return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyDate obj=new MyDate();
       obj.show();
       //System.out.println(obj.hashCode());
       
       MyDate obj1=new MyDate(9,2,24);
       obj1.show();
       
       MyDate obj2=new MyDate(9,2,24);
       obj2.show();       obj1.show();
      // System.out.println(obj1.hashCode());
      // boolean b=obj.equals(obj1);
      // System.out.println(b);
       
       System.out.println(obj2.equals(obj1));
	}

}
