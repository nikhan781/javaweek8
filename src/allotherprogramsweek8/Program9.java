package allotherprogramsweek8;
/* 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fib = scanner.nextInt();
        fibonacciNumber(fib);
        scanner.close();

    }

    public static void fibonacciNumber(int count) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;

        while (count > 0 && count <= 99) {
            for (int i = 1; i < count; i++) {
                if (num3 <= 144) {
                    System.out.print(num1 + " ");
                    num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3;

                } else if (num3 >= 144) {
                    System.exit(1);
                } else
                    System.out.println(" Value is out of bound");
            }
        }
    }
}

