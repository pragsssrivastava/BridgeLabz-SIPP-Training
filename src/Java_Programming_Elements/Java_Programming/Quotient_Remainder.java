package Java_Programming;
import java.util.Scanner;
public class Quotient_Remainder {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the First Number : " );
		int FirstNumber = input.nextInt();
		
		System.out.print("Enter the Second Number : ");
		int SecondNumber = input.nextInt();
		
		int quotient = FirstNumber / SecondNumber;
        int remainder = FirstNumber % SecondNumber;
        
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                " of two numbers " + FirstNumber + " and " + SecondNumber);
	}

}
