package JavaProgrammingBridgelabs;

import java.util.Scanner;

public class CharArrayCompare {

    static char[] getChars(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String text = sc.nextLine();         
        char[] manual = getChars(text);           
        char[] builtin = text.toCharArray();       

        boolean isSame = compareArrays(manual, builtin);

        System.out.println("Are both arrays same? " + isSame);
    }
}
