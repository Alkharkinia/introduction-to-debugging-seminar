package debugtrie;

public class semantic {
	
	// -------Semantic Errors-------
	// Occur when the rules of the programming language are violated.
	// Program doesn't run.

    public static void main(String[] args) {
    	
    	//Comment out shortcut: Ctrl + Shift + / [7] (Windows), Cmd + / [7] (MacOS)
    	//Indent Key: Tab
    	//Remove Indent shorcut: Shift + Tab
		//syso to System.out.println(); fn control space for macos crtl space for windows

//        // 1️. Type incompatibility
//        int age = "25"; // ❌ Compiler error: cannot assign String to int
//
//        // 2️. Unknown references
//        Strin name; // Strin is not defined
//        system.out.println("Name: " + name); // ❌ Compiler error: system should be System
//
//        // 3️. Uninitialized variable
//        int counter;
//        counter++; // counter is not initialized
//
//        // 4️. Errors in expressions
//        String s = "Hello";
//        int x = 5 - s; // cannot subtract String from int

        // 5️. Array index out of range (runtime error)
        int[] scores = new int[3];
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 70;
        scores[3] = 100; // ❌ Runtime error: ArrayIndexOutOfBoundsException
        
    }

}


