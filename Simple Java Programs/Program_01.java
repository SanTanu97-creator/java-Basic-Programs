/*Java Program to Check Whether a Given Number is Even or Odd */

import java.util.Scanner;

public class Program_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.println("Enter 1 to check a number ");
            System.out.println("Enter 0 to exit ");
            int value = sc.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Enter a number: ");
                    int num = sc.nextInt();

                    if (num % 2 == 0) {
                        System.out.println(num + " is an even number");
                    } else {
                        System.out.println(num + " is an odd number");
                    }
                    break;

                case 0:
                    continueChecking = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
                    break;
            }
        }

        sc.close(); // Close the scanner
        System.out.println("Program exited.");
    }
}
