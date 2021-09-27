package switchsample1;

import java.text.BreakIterator;
import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1 for Poratta \n2 for Biryani \n3 for Fired Rice \n4 for Mandhi \n Enter your choice");
		
		int choice =s.nextInt();
		
		 switch (choice) {
		 
		 case 1:
			System.out.println("You are select Poratta");
			break;
		 case 2:
			 System.out.println("You are select Biryani");
			 break;
		 case 3:
			 System.out.println("You are select Fired Rice");
			 break;
		 case 4:
			 System.out.println("You are select Mandhi");
			 break;
			 default:
				 System.out.println("!!!!!FOOL!!!!");

		}
}
}