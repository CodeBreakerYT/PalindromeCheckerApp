import java.util.Scanner;
public class PalindromeCheckerApp {

    /*
    UC1 : Application Entry and Welcome Message
    UC2 : Print a Hardcoded Palindrome Result
    UC3 : Palindrome Check Using String Reverse

     @author Rishav
     @version 1.0
     */
    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.next();

        // String to store reversed value
        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        //Compare string both input and reversed
        boolean isPalindrome = input.equals(reversed);

        System.out.println("Reversed String : " + reversed);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}