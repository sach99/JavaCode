package String;

public class StringReverse {
	
	public static void main(String[] args) {
		//i/p- javaj
		//o/p- javaj
		
		String str = "abbaa";
		String endStr = "";
		
		for (int i=0; i<str.length(); i++)
		{
		 char ch= str.charAt(i); //a
		 endStr= ch+endStr; //avaj
		}
		
		
		System.out.println("Reversed word: "+endStr);
		
		if(str.equals(endStr))
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is not Palindrome");
			
		
		
			
	 }


}
