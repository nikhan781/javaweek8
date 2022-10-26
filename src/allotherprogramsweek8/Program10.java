package allotherprogramsweek8;
/* 10. Write a program to input any number and check if it Armstrong number or not
 */

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        armstrongNumber(num);
        scanner.close();
    }

    public static void armstrongNumber(int number) {
        int digits = 0;
        int total = 0;
        int a = number;

        while (number != 0) {
            digits = number % 10;
            total = total + digits * digits * digits;
            number = number / 10;
        }
        if (total == a)
            System.out.println(a + " is an Armstrong number");
        else
            System.out.println(a + " is not an Armstrong number");


    }


}
