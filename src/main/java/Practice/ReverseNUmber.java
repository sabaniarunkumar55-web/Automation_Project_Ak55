package Practice;
import java.util.Scanner;

public class ReverseNUmber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int input=sc.nextInt();
		int num=0;
		int rev=0;
		
		while(input!=num) {
			
			int digit=input%10;
			
			rev=rev*10+digit;
			
			input=input/10;
			
		}
		
		System.out.println("Reversed Number:"+rev);
		
		sc.close();
	}

}
