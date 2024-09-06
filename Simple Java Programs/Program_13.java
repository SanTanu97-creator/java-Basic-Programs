/*Java Program to Perform Arithmetic Operations */

import java.util.Scanner;

public class Program_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        boolean check = true;
        while (check) {
            System.err.println("====choose Operation====");
            System.out.println("+   -   x   /");
            System.out.println("Enter '0' to exit the program");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '+':
                    System.out.println("Enter 1st number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    num2 = sc.nextInt();

                    System.out.println("Answer is : "+num1 + num2);
                    break;
                case '-':
                    System.out.println("Enter 1st number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    num2 = sc.nextInt();

                    System.out.println(num1 - num2);
                    break;
                case 'x':
                    System.out.println("Enter 1st number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    num2 = sc.nextInt();

                    System.out.println("Answer is : "+num1 * num2);
                    break;
                case '/':
                    System.out.println("Enter 1st number: ");
                    num1 = sc.nextInt();
                    System.out.println("Enter 2nd number: ");
                    num2 = sc.nextInt();

                    System.out.println("Answer is : "+num1 / num2);
                    break;
                case '0':
                    check = false;
                    break;
                default:
                    System.out.println("invalid Choice !");
                    break;
            }

        }
        sc.close(); // Close the scanner
        System.out.println("Program exited.");
    }
}
