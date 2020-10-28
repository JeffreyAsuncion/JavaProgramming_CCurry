public class Variables2 {

    public static void main(String[] args) {
    
        String string = new String("This is a string");
	String easier = "Wow, that was easy!" + string;

	int x = 5; // primative
        Integer y = 5; //object Class Integer (5 is autoboxed)

        System.out.println(easier);

	System.out.println(x); // primative
	System.out.println(y); // Object Class Integer

    }
}
