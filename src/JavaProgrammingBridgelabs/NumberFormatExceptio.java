package JavaProgrammingBridgelabs;
import java.util.Scanner;

public class NumberFormatExceptio {

    static void generateNumberFormatException(String text) {
       
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to convert to number: ");
        String input = sc.nextLine();

        handleNumberFormatException(input);
    }
}
