package Base;

public class BaseTest {

	
	
	
	public static void main(String[] args) {
		
		
		String input="I am arun";
		
		
		String[] word = input.split(" ");
		String result=" ";
		
		System.out.println(word[2]);
		
		
		for(int i =0;i<word.length;i++) {
			
			
		  result=result + reverseWord(word[i]);
		  
		  if(i!=word.length-1) {
			  
			  result=result+" ";
		  }
			
		}
		
		System.out.println(result);
		
	}
	
	
	
	public  static String reverseWord(String word) {
		
		String resverse="";
		
		for(int j=word.length() - 1;j>=0;j--) {
			resverse=resverse +word.charAt(j);
		}
		
		return resverse;
		
		
	}
}
