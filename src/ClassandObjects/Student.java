package ClassandObjects;

public class Student {
   
	int rollNo ;
	String name ;
	int marks ;
	char grade ;
	
	void display()
	{
		System.out.println("Roll no: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
	}
	void setData(int rNo,String nam,int mark,char gr)
	{
		rollNo = rNo;
		name= nam;
		marks = mark;
		grade = gr;
		
	}
	
	String goodMorning(String name)
	{
	return 	"Good Morning "+name;
	}
	
	String goodBye()
	{
	return 	"Bye Bye";
	}
	
	
	

}
