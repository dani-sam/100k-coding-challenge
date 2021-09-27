import java.util.Scanner;

public class NNumber {
	public static void main(String g[]) {
		
		Scanner c=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=c.nextInt();
		int sum=0;
		
		for(int i=0;i<num;i++) {
			sum=sum+i;
		}
		System.out.println("Result is "+sum);
	}

}
