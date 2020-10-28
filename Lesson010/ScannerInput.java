import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
	
	System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
	String x = scanner.nextLine();
	System.out.println("You typed : " + x);

 	System.out.println("Enter an Integer: ");
	int y = scanner.nextInt();
	System.out.println("You typed : " + y);

	int a = y + 10;
	System.out.println("Integer + 10 = " + a);

    }
}
