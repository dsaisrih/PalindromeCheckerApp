import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of a palindrome validation algorithm.
 *
 * The application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * Focus: Performance measurement & benchmarking
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

        // Create strategy instance
        PalindromeStrategy strategy = new TwoPointerStrategy();

        // Start time
        long startTime = System.nanoTime();

        // Execute algorithm
        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        // Calculate execution time
        long duration = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + duration + " ns");

        scanner.close();
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Two Pointer Implementation
 */
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start <= end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}