package allotherprogramsweek8;
/* 13. Shared Digit
 */

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        int firstD = scanner.nextInt();
        System.out.print("Enter 2nd value: ");
        int secondD = scanner.nextInt();
        System.out.println(hasSharedDigit(firstD, secondD));
        scanner.close();

    }

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int fDigits = a;

        while (fDigits != 0) {
            int sDigit = b;
            while (sDigit != 0) {
                if ((fDigits % 10) == (sDigit % 10)) {
                    return true;
                }
                sDigit = sDigit / 10;
            }
            fDigits = fDigits / 10;
        }
        return false;
    }
}
