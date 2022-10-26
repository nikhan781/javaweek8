package allotherprogramsweek8;
// 15. Display left angle triangle of * using nested for loops

import java.util.Scanner;

public class Program15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lenght of the triangle: ");
        int tri = scan.nextInt();
        leftTriangle(tri);
        scan.close();

    }

    public static void leftTriangle(int num) {
        int n = num;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++)
                System.out.print("   ");
            for (int j = 1; j <= i; j++)
                System.out.print("*  ");

            System.out.println("");
        }
    }
}