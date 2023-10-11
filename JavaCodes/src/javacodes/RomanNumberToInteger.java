package javacodes;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class RomanNumberToInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String romanNumeral = sc.next(); 
        int integerEquivalent = romanToInt(romanNumeral);
        System.out.println("Integer equivalent: " + integerEquivalent);
	}
	 public static int romanToInt(String s) {
		Map<Character,Integer> romToInt = new HashMap<>();
		romToInt.put('I', 1);
		romToInt.put('V', 5);
		romToInt.put('X', 10);
		romToInt.put('L', 50);
		romToInt.put('C', 100);
		romToInt.put('D', 500);
		romToInt.put('M', 1000);
		
		int result = 0;
		 int prevValue = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romToInt.get(currentChar);
            
            
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            
            prevValue = currentValue;
        }
		return 0;
	}

}
