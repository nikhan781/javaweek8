package allotherprogramsweek8;
/*Read 10 numbers from the console entered by the user and print the sum of those
numbers.*/
import java.util.Scanner;
public class ReadingUserInputChallenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int total = 0;

        while (count <= 10) {
            System.out.println("Enter number : " + count);

            boolean validateNum = scanner.hasNextInt();
            if (validateNum) {
                int num = scanner.nextInt();
                total += num;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + total);

        scanner.close();
    }

}
