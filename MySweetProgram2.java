import java.util.Scanner;


public class MySweetProgram2 {

    public static void main(String[] args) { // methods
        System.out.println("What is your name? ");
    
  	// type identifier = new type();
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();

	System.out.println("Hello " + name);

    }

}

// comment
// class - Contains everything - has members
// methods - do Something
// arguments - What you pass to a method (part of the calling)
// parameter -  Variables to store arguments (part of definition)
// statements - Telling the computer something
// properties - store something
//
// access modifier (public) - Who can use?
// static - No instance of class is needed
// object - instance of class
