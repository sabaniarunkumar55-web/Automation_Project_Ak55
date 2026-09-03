package Practice;

public class ReturnType {

	
	public  int add(int a,int b) {
		return a+b;
	}
	public static String fullname(String fn, String ln) {
		return fn+ln;
	}
	public static void main(String[] args) {
		ReturnType obj=new ReturnType();
		int addition=obj.add(3,6);
		System.out.println("Additoion"+addition);
		String fullName = fullname("Arun","Sabani");
		System.out.println("FullName:"+fullName);
		
	}
	
	
	
	
	
}
