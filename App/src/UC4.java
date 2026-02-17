/**
 * ============================================================
 * MAIN CLASS – UseCase4PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 *  - Converts string to character array
 *  - Uses start and end pointers
 *  - Compares characters efficiently
 *  - Displays the result on console
 *
 * This reduces extra memory usage compared
 * to reverse-string approach.
 *
 * @author D SAI SRI HARSHIT
 * @version 4.0
 * ============================================================
 */

public class UC4 {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ------------------------------------------------------
        // Step 1: Declare and initialize the input string
        // ------------------------------------------------------
        String input = "radar";

        // ------------------------------------------------------
        // Step 2: Convert string into character array
        // Example: radar → [r, a, d, a, r]
        // ------------------------------------------------------
        char[] chars = input.toCharArray();

        // ------------------------------------------------------
        // Step 3: Initialize two pointers
        // start → beginning of array
        // end   → last character of array
        // ------------------------------------------------------
        int start = 0;
        int end = chars.length - 1;

        // ------------------------------------------------------
        // Step 4: Assume palindrome initially
        // ------------------------------------------------------
        boolean isPalindrome = true;

        // ------------------------------------------------------
        // Step 5: Compare characters until pointers cross
        // ------------------------------------------------------
        while (start < end) {

            // If mismatch found → Not palindrome
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            // Move pointers towards center
            start++;
            end--;
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
