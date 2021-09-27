package supersample;

public class B extends A {
	int a;
	B(){
		System.out.println("Its  B constructor");
	}
	B(int b){
		super(88);
		System.out.println("Its B argument constructor");
	}
	
	
	
	
	void display() {
		
		System.out.println("Its B");
		
		
		a=10;
		super.b=40;
		 
		int c=a+super.b;
		System.out.println(c);
	
	}
	
	void basedisplay() {
		super.display();
	}
	public static void main(String[] args) {
		B b=new B(55);
		/*b.display();
		b.basedisplay();
*/
	}

	
}


	