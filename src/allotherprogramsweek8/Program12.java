package allotherprogramsweek8;

import java.util.Scanner;

/* 12. Write a programme to input any number and check if it is prime or not.
 */
public class Program12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        int prime = scanner.nextInt();
        primeNumber(prime);
        scanner.close();
    }

    public static void primeNumber(int num) {
        int nPrime = 0;
        if (num <= 1) {
            System.out.println("it is not a prime number");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is a not prime number");
                    nPrime = 1;
                    break;
                }
            }
            if (nPrime == 0) {
                System.out.println(num + " is a prime number");
            }
        }
    }
}
