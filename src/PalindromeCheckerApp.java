import java.util.Scanner;

public class PalindromeCheckerApp {

    /*
     UC1 : Application Entry and Welcome Message
     UC2 : Print a Hardcoded Palindrome Result
     UC3 : Palindrome Check Using String Reverse
     UC4 : Character Array Based Palindrome Check

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

        // Convert String to character array
        char[] chars = input.toCharArray();

        // Two-pointer technique
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            // Array indexing for comparison
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
