import java.util.*;

public class PalindromeCheckerApp {

    /*
     UC9: Recursive Based Palindrome Checker

     @author Rishav
     @version 1.0
     */

    // Recursive method to check palindrome
    private static boolean check(String s, int start, int end) {

        // Base case: single character or empty string
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving towards center
        return check(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String input = sc.next();

        boolean isPalindrome = check(input, 0, input.length() - 1);

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}