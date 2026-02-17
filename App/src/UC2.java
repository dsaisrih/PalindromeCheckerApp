import java.util.Scanner;

public class UC2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Input text: ");
        String input = scanner.nextLine();

        // Clean input (remove spaces and convert to lowercase)
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Required output format
        System.out.println("Is it a palindrome ? : " + (isPalindrome ? "True" : "False"));

        scanner.close();
    }
}
