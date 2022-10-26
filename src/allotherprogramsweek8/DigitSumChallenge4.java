package allotherprogramsweek8;

/* 4. Digit Sum Challenge */

import java.util.Scanner;

public class DigitSumChallenge4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = scanner.nextInt();
        System.out.println(sumDigits(a));
        scanner.close();
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            while (number != 0) {
                int d = number % 10;
                number = number / 10;
                sum += d;
            }
            return sum;
            //System.out.println("The sum of entered value is: " + sum);

        } else {
            //System.out.println((-1 + " :(Invalid number)"));
            return -1;
        }
        //return sum;
    }

}