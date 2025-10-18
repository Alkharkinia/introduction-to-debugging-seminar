package debugtrie;

public class syntax {

    public static void verifyLogin(String user, String password) {
    	
        if (user.equals("admin")) { {
            System.out.println("Username accepted.");
            System.out.println("Verifying password..."); }
            if (password.equals("1234"))
                System.out.println("Login successful!");
            else
                System.out.println("Incorrect password!"); }
        else {
            System.out.println("Invalid username!");
        
        System.out.println("End of login attempt."); } 
    }
    
    public static void main(String[] args) {
    	
    	verifyLogin("administrator", "1234");
    	
    	System.out.println();
    	
    	verifyLogin("admin", "1236");
    	
    	System.out.println();
    	
    	verifyLogin("admin", "1234");

        
    }
}
