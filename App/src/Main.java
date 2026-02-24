import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ============================================================
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * Demonstrates how different palindrome validation algorithms
 * can be selected dynamically at runtime using the Strategy Pattern.
 *
 * The application:
 * - Defines a common PalindromeStrategy interface
 * - Implements a concrete StackStrategy
 * - Injects the strategy at runtime
 * - Executes the selected algorithm
 *
 * Focus: Algorithm interchangeability
 *
 * @author D SAI SRI HARSHIT
 * @version 1.0
 * ============================================================
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * ============================================================
 * INTERFACE - PalindromeStrategy
 * ============================================================
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * ============================================================
 * CLASS - StackStrategy
 * ============================================================
 * Implements palindrome validation using Stack (LIFO).
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}S