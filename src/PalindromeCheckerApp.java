import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    /*
     UC1 : Application Entry and Welcome Message
     UC2 : Print a Hardcoded Palindrome Result
     UC3 : Palindrome Check Using String Reverse
     UC4 : Character Array Based Palindrome Check
     UC5 : Stack-Based Palindrome Checker

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

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
