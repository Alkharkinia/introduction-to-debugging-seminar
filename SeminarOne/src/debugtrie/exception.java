package debugtrie;

public class exception {

    public static void main(String[] args) {
        String[] names = {"Alice", null, "Charlie"};
        
        
        for (int i = 0; i < names.length; i++) {
                System.out.println("Length of " + names[i] + " is " + names[i].length());
        
                System.out.println("Iteration " + i + " complete.");
        }

        /*
        for (int i = 0; i < names.length; i++) {
            try {
                System.out.println("Length of " + names[i] + " is " + names[i].length());
            } catch (NullPointerException e) {
                System.out.println("Error: Encountered a null value at index " + i);
                e.printStackTrace(); // Shows full exception stack trace
            } finally {
                System.out.println("Iteration " + i + " complete.\n");
            }
        }
        */
    }

}
