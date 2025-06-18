package JavaProgrammingBridgelabs;

import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String text) {
      
        String sub = text.substring(5, 2);
        System.out.println("Substring: " + sub);
    }

    static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = sc.nextLine();

        handleException(input);
    }
}
