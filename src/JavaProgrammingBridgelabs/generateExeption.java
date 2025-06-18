package JavaProgrammingBridgelabs;

import java.util.*;

public class generateExeption {
    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();

        try {
            System.out.println(text.charAt(100)); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }
}
