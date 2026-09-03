package Practice;

public class ReverseSentence {
	
	public static String result="";
	public static void main(String[] args) {
		
		reverseWordWitoutChngingSeq();
		System.out.println("Reverse word Without changing sequence"+result);
		
		String reversed=reverseWordOrder(" I am Arun");
		System.out.println("Reverse Words Without Reversing Letters:"+reversed);
		
		
	}
	
	
	public static void reverseWordWitoutChngingSeq() {
		
		String sentence=" I am strong";
		
		String[] word = sentence.split(" ");
for(int i=0;i<word.length;i++) {
			
			result=result+revWord(word[i]);
			
			
			if(i!=word.length-1) {
				
				result=result+" ";
				
			}
			
		}
		
	
	}
	public static String revWord(String word) {
		
		String reverse="";
		
		for(int j=word.length()-1;j>=0;j--) {
			
			reverse=reverse+word.charAt(j);
			
		}
		
		return reverse;
	}
	
	
	
	public static String reverseWordOrder(String sentence) {
		
		String [] word=sentence.split(" ");
		String revWords="";
		
		for(int i=word.length-1;i>0;i--) {
			
			revWords=revWords+word[i];
			
			
			if(i!=0) {
				
				revWords=revWords+" ";
			}
		}
		return revWords;
		
		
	}

}
