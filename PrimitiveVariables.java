import java.util.Scanner;


public class PrimitiveVariables {

    public static void main(String[] args) { // methods
        
	int x = 5; // primitive

	Integer y = 5; // object (5 is autoboxed)
	
	System.out.println(x);
	System.out.println(y);


	String string = new String("This is a string");  // created String Object

	String easier = "Wow, that was easy!!!" + string;
	System.out.println(easier);




    }

}

// 8 primitive types (boolean, byte, char, short, int, long, float, double)
// objects - instance of a class (class the data type)

// statically typed = variables are given data types up front (before compling)
// dynamically typed = variables do not have types


// data type = the type of the data. How the computer interprets the data

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
