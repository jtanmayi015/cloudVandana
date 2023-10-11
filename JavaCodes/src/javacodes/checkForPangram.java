package javacodes;

public class checkForPangram {

	public static void main(String[] args) {
		String testString = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(testString);
        
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }

	}
	public static boolean isPangram(String str) {
        
        boolean[] alphabet = new boolean[26];
       
        str = str.toLowerCase();
       
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                alphabet[index] = true;
            }
        }
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }
        
        return true;
	}
}
