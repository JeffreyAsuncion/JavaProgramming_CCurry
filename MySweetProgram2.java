import java.util.Scanner;


public class MySweetProgram2 {

    public static void main(String[] args) { // methods
        System.out.println("What is your name? ");
    
  	// type identifier = new type();
	Scanner scanner = new Scanner(System.in);     // created Scanner Object
	String name = scanner.nextLine();

	System.out.println("Hello " + name);

	String string = new String("This is a string");  // created String Object
	System.out.println(string + " :)");


	// another way to make a string
	String easier = "Wow, that was easy!!!";
	System.out.println(easier);




    }

}

// literals - the value 

// variable - stores some value
// expression - evaluates to a value
// operator - work on operands to produce a value
// operand - the thing(s) the operator works on

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
