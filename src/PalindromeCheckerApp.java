import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    /*
     UC1 : Application Entry and Welcome Message
     UC2 : Print a Hardcoded Palindrome Result
     UC3 : Palindrome Check Using String Reverse
     UC4 : Character Array Based Palindrome Check
     UC5 : Stack-Based Palindrome Checker
     UC6 : Queue + Stack Based Palindrome Check

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

        // Queue for FIFO behavior
        Queue<Character> queue = new LinkedList<>();

        // Stack for LIFO behavior
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (char c : input.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) and pop (stack)
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);

        sc.close();
    }
}
