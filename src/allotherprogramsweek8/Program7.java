package allotherprogramsweek8;
/*First And Last Digit Sum
 */

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = scanner.nextInt();
        sumFirstAndLastDigit(num);
        scanner.close();

    }

    public static void sumFirstAndLastDigit(int number) {
        int sum;
        int fDigit = 0;
        int lDigit = 0;
        lDigit = number % 10;
        if (number >= 0) {
            while (number != 0) {
                sum = number % 10;
                fDigit = sum;
                number = number / 10;
            }
            System.out.println("Sum of first and last digit of value : " + (fDigit + lDigit));
        } else {
            System.out.println(-1);
        }

    }
}
