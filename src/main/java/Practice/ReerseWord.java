package Practice;

import java.util.Scanner;

public class ReerseWord {
	

	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word");
		String input = sc.nextLine();
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--) {
			
			rev=rev+input.charAt(i);
			
			
			
			
		}
		
		System.out.println("Reverse Word:"+rev);
		
		sc.close();
		
		
		
	}

}
