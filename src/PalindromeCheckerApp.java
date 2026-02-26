import java.util.*;

public class PalindromeCheckerApp {

    /*
     UC8: Linked List Based Palindrome Checker

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

        // LinkedList for double-ended operations
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}