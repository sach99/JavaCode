package ClassandObjects;

public class Overload {

	int a;
	int b;
	double c;
	
	
	
	void add()
	{
		
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void add(int x,int y)
	{
	a=x;
	b=y;
	System.out.println(a+b);
	}
	
	void add(int x,double y)
	{
	a=x;
	c=y;

	System.out.println(a+c);
	}
}
