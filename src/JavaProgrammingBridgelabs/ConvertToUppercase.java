package JavaProgrammingBridgelabs;
import java.util.Scanner;
public class ConvertToUppercase {
	public static String toUpper (String text) {
		String result = " ";
		for (int  i = 0; i< text.length(); i++) {
			char c = text.charAt(i);
			result += ( c >= 'a' && c <= 'z' ) ? (char) (c - 32 ) : c;
		}
		return result;
	}
	public static boolean compareStrings(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		for ( int i = 0; i <s1.length(); i++ ) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main (String[] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Sentence");
		String input  = sc.nextLine();
		
		String builtInUpper = input.toUpperCase();

        String manualUpper = toUpper(input);

        boolean areEqual = compareStrings(builtInUpper, manualUpper);

        System.out.println("Built-in Upper: " + builtInUpper);
        System.out.println("Manual Upper: " + manualUpper);
        System.out.println("Are both uppercase versions same? " + areEqual);
	}
	

}
