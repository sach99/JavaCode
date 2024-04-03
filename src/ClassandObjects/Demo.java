package ClassandObjects;

public class Demo {

	int a;   //class or instance
	int b;
	float c;
	
	Demo()       // function , ClassName , no Return type
	{
		a=5;
		b=6;
		c=5.0f;
	}
	
	Demo(int x,int y)
	{
		a=x;
		b=y;
	}
	
	Demo(float z)
	{
		c=z;
		
	}
	
	Demo(float z,int x)
	{
		c=z;
		a=x;
		
	}
	
	Demo(int a,int b,float c)//a=6,b=8,c=7.0
	{
		//this
		
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public static void main(String[] args) {
		
		
		
		Demo obj1 = new Demo(6,8,7.0f);
		
		
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		
		
		
		
	}

}
