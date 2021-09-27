import java.util.Scanner;

public class FunctionSample1 {
	public static void main(String d[]) {
		
		Scanner gh=new Scanner(System.in);
		
		System.out.println("Enter two number ");
		 
		int num1=gh.nextInt();
		int num2=gh.nextInt();
		 
		int R=sum(num1,num2);
		
		System.out.println("Result is "+R);
		
	}
	
	
	static int sum(int a, int b) {
		int c=a+b;
	    
		return c;
	}
	
	

}
