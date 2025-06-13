package bridgelab2;
import java.util.Scanner;
public class Q_twenty {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the salery of the user : ");
		int salery = input.nextInt();
		
		System.out.print("Enter the bonus recived the user : ");
		int bonus = input.nextInt();
		
		int income = salery + bonus;
		
		System.out.println("The salary is INR" + salery + " and the bonus is INR " + bonus + " Hence Total Income is INR " + income );
	}

}
