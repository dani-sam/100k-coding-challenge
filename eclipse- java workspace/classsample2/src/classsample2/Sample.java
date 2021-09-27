package classsample2;

import java.util.Scanner;

public class Sample {
public static void main(String ar[]) {
	 
	Scanner de=new Scanner(System.in);
	
System.out.println("Enter two no:");
	
	int num1=de.nextInt();
	int num2=de.nextInt();
	
	System.out.println("Enter two no:");
	
	int num3=de.nextInt();
	int num4=de.nextInt();
	
Sum s=new Sum();


s.calculateSum(num1, num2);
 
s.displaySum();


s.calculateSum(num3, num4);
s.displaySum();
}

}
