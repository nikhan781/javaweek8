package allotherprogramsweek8;

/*5. Palindrome Number
 */

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(isPalindrome(num));
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int a = number;
        int reverse = 0;
        int sum = 0;

        while (number > 0 || number < 0) {
            reverse = number % 10;
            sum = (sum * 10) + reverse;
            number = number / 10;
        }
        if (a == sum) {
            return true;
        } else
            return false;
    }
}