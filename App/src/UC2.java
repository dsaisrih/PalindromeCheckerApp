/**
 * ============================================================
 * MAIN CLASS – UseCase2PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a predefined string value.
 *
 * At this stage, the application:
 *  - Stores a predefined string
 *  - Compares characters from both ends
 *  - Determines whether the string is a palindrome
 *  - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author D SAI SRI HARSHIT
 * @version 2.0
 * ============================================================
 */

public class UC2 {

    /**
     * Application entry point for UC2.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ------------------------------------------------------
        // Step 1: Store a hardcoded string
        // You can change this value to test other words
        // ------------------------------------------------------
        String input = "madam";

        // ------------------------------------------------------
        // Step 2: Assume string is palindrome initially
        // This flag will change if mismatch found
        // ------------------------------------------------------
        boolean isPalindrome = true;

        // ------------------------------------------------------
        // Step 3: Loop only till half of string length
        // Compare characters from start and end
        // Example: m a d a m
        // Compare m-m, a-a
        // ------------------------------------------------------
        for (int i = 0; i < input.length() / 2; i++) {

            // Check if characters are NOT equal
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {

                // If mismatch found → Not palindrome
                isPalindrome = false;
                break;   // Stop checking further
            }
        }

        // ------------------------------------------------------
        // Step 4: Display Result
        // ------------------------------------------------------
        if (isPalindrome)
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
}
