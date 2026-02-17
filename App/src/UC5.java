/**
 * ============================================================
 * MAIN CLASS – UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 *  - Pushes characters into stack
 *  - Pops them in reverse order
 *  - Compares with original sequence
 *  - Displays the result
 *
 * This maps stack behavior to reverse logic.
 *
 * @author D SAI SRI HARSHIT
 * @version 5.0
 * ============================================================
 */

import java.util.Stack;

public class UC5 {

    /**
     * Application entry point for UC5.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ------------------------------------------------------
        // Step 1: Declare and initialize the input string
        // ------------------------------------------------------
        String input = "noon";

        // ------------------------------------------------------
        // Step 2: Create a Stack to store characters
        // ------------------------------------------------------
        Stack<Character> stack = new Stack<>();

        // ------------------------------------------------------
        // Step 3: Push each character into stack
        // Example: n o o n → stack top becomes last char
        // ------------------------------------------------------
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // ------------------------------------------------------
        // Step 4: Assume palindrome initially
        // ------------------------------------------------------
        boolean isPalindrome = true;

        // ------------------------------------------------------
        // Step 5: Compare original string with popped values
        // Stack pops in reverse order
        // ------------------------------------------------------
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // ------------------------------------------------------
        // Step 6: Display result
        // ------------------------------------------------------
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        // ------------------------------------------------------
        // Step 7: End of Program
        // ------------------------------------------------------
    }
}