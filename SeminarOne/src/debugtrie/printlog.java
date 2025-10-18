package debugtrie;

public class printlog {
	    
    public static String decryptCeasar(String text, int key) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c != 32) { //ASCII value for " " (space)
            	int charIndex = c - 'a';               // convert 'a'-'z' to 0-25
            	int shiftedIndex = charIndex - key;  
            	//System.out.println("Shifted index is: " + shiftedIndex);
            	shiftedIndex = shiftedIndex % 26; 
            	c = (char) ('a' + shiftedIndex);       // convert back to char
            	//System.out.println("Character is: " + c);

            }

            result += c;
        }

        return result;
    }
    
	public static void main(String[] args) {
        String ciphertext = "khoor zruog";
        int key = 3;

        String plaintext = decryptCeasar(ciphertext, key);
        System.out.println("Decrypted text: " + plaintext);
    }

}
