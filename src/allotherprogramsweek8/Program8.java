package allotherprogramsweek8;

import java.util.Scanner;

/* 8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Program8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to print @: ");
        int a = scanner.nextInt();
        Program8 program8 = new Program8();
        program8.rightAngleTriangle(a);
        scanner.close();
    }

    public void rightAngleTriangle(int number) {
        //char at = '@';

        for (char at = 1; at <= number; at++) {

            for (char j = 1; j <= at; j++)
                System.out.print("@");
            System.out.println("");
        }

    }
}
