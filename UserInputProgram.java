import java.util.Scanner;
import java.math.BigDecimal;

public class UserInputProgram {
    
    public static void main(String[] args) {
         
	Scanner scanner = new Scanner(System.in);
	
	//String x = scanner.nextLine();
	//System.out.println(x);

	System.out.println("Input an int: ");
	int y = scanner.nextInt();
	System.out.println(y);

	int a = y + 10;
	System.out.println("This is the sum of int and 10");
	System.out.println(a);

	System.out.println("Input a BigDecimal: ");
	BigDecimal money = scanner.nextBigDecimal();
	System.out.println(money);

	System.out.println("Input a Boolean: ");
	boolean x = scanner.nextBoolean();
	System.out.println(x);	
    }
}
