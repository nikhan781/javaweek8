package allotherprogramsweek8;
/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        vowel();

    }

    public static void vowel() {
        Scanner scanner = new Scanner(System.in); // Scanner
        System.out.print("Enter a character : ");
        char cha = scanner.next().charAt(0); //user to input a character

        if (cha == 'a' || cha == 'A' || cha == 'e' || cha == 'E' || cha == 'i' || cha == 'I' || cha == 'o' || cha == 'O' || cha == 'u' || cha == 'U') {
            System.out.println("The character is " + cha + " is a Vowel");//print when 'if' condition is true
        } else if (cha >= 'a' && cha <= 'z' || cha >= 'A' && cha <= 'Z') {// print when 'if' condition is false
            System.out.println("The character is " + cha + " is a Consonant");
        } else {
            System.out.println("The character is not an alphabet");//print when 'if' w  both conditions are false

        }
        scanner.close();
    }


}
