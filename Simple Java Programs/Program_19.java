/*Java Program to Accept the Height of a Person & Categorize as Taller, Dwarf & Average */

import java.util.Scanner;

public class Program_19 {
    public static void main(String[] args) {

        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height:");
        m = sc.nextInt();
        if (m > 175) {
            System.out.println("The person is tall.");
        } else if (m > 155 && m <= 175) {
            System.out.println("The person has average height.");
        } else {
            System.out.println("The person is dwarf.");
        }
        sc.close();
    }
}
