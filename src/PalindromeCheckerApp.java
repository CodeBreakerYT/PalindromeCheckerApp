import java.util.Scanner;
public class PalindromeCheckerApp {

    /*
    UC1 : Application Entry and Welcome Message
    UC2 : Application Entry and Welcome Message

    @author Rishav
    @version 1.0
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner sc=new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.next();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

    }
}