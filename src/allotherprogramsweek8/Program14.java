package allotherprogramsweek8;
/* Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
 */

import java.util.Scanner;

public class Program14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the triangle: ");
        int size = scanner.nextInt();
        trinagle(size);
        scanner.close();
    }

    public static void trinagle(int num) {
        int n = num;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print("  ");
            for (int j = 1; j < i; j++)
                System.out.print("* ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("  ");
            for (int j = i; j < n; j++)
                System.out.print("* ");
            for (int j = i; j <= n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

