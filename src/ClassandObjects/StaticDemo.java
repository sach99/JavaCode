package ClassandObjects;

public class StaticDemo {
   static int count= 0;
    int b= 20;
    StaticDemo()
    {
    	count++;
    }
    
   static void fun()
    {
    	System.out.println(count);
    }
	
	public static void main(String[] args) {
		
		System.out.println(count);
		
		StaticDemo o1 = new StaticDemo();
		System.out.println(o1.count);
		System.out.println(o1.b);
		
		
		StaticDemo o2 = new StaticDemo();
		System.out.println(o2.count);
		//System.out.println(o2.b++);
		
		StaticDemo o3 = new StaticDemo();
		System.out.println(o3.count);
		//System.out.println(o3.b++);
		
		
		
		

	}

}
