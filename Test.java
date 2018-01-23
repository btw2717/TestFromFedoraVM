import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = keyboard.next();
		System.out.println();
		System.out.println("Hello " + name + "!");
	}
}
