package allotherprogramsweek8;

/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.*/

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        loop();

    }

    public static void loop() {
        Scanner obj = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int b;
        System.out.print("Enter number: ");
        for (int i = 1; i > 0; i++) {
            while (obj.hasNextInt());
                b = obj.nextInt();

                if (b > maximum)
                    maximum = b;


                if (b < minimum)
                    minimum = b;


                System.out.println("The maximum number is: " + maximum);
                System.out.println("The minimum number is: " + minimum);
                break;
            }
        }
    }


