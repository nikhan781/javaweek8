package allotherprogramsweek8;
/* Even Digit Sum
 */

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scan.nextInt();
        System.out.println(getEvenSum(num));
        scan.close();

    }

    public static int getEvenSum(int number) {
        int sum = 0;
        int lDigit = 0;

        if (number > 0) {
            while (number != 0) {
                lDigit = number % 10;
                if (lDigit % 2 == 0) {
                    sum += lDigit;
                }
                number = number / 10;
            }
        } else if (number < 0) {
            return -1;
        }

        return sum;
    }
}