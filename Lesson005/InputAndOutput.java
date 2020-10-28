
import java.util.Scanner;

public class InputAndOutput {

    public static void main(String[] args) {
    
        System.out.println("What is your name? ");

	Scanner scanner = new Scanner(System.in);
	// fully qualify Scanner if you don't import TOO VERBOSE
	//java.util.Scanner scanner = new java.util.Scanner(System.in);
	String name = scanner.nextLine();

	System.out.println("Hello " + name);

    }
}
