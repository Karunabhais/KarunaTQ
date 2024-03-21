package Com.CollectionFramwork;

public class ArrayListDemo {
	Object obj;
	public ArrayListDemo()
	{
		
	}
	public ArrayListDemo(Object o)
	{
		obj=o;
		
	}
	public Object getObject()
	{
		return obj;
	}
	public void showType()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayListDemo obj=new ArrayListDemo(12);
       obj.showType();
       int i=(int)obj.getObject();
       
       ArrayListDemo str=new ArrayListDemo("Java");
       str.showType();
       String str1=(String)str.getObject();
      // System.out.println(str);
       
       
       
       
        
        
      
       
	}
	
		
	}


