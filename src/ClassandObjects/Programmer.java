package ClassandObjects;
class Programmer extends Employee{
	
	
	int bonus=10000;  
	
	
	

	public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   //JavaProgrammer jp=new JavaProgrammer();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	   p.display();
	   
	}  
}
