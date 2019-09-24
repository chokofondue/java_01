
public class MyMethodApp {
	public static void printA_4() {
		printA("A");
		printA("B");
		printA("C");
		printA("D");
	}
	
	public static void printA(String text) {
		System.out.println(text);
		System.out.println(text);
	}	
	
	public static void main(String[] args) {
		
		printA_4();
		System.out.println("B");
		System.out.println("B");

	}	

}
