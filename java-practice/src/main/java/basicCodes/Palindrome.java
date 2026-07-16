package basicCodes;

import java.util.Scanner;

public class Palindrome {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check if it is palindrome or not: ");
        String str = sc.nextLine();
        String newstr = new StringBuilder(str).reverse().toString();

        if(str.equals(newstr)) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }
    }
}
