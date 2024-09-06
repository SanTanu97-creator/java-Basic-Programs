/*Java Program to Find Sum of Digits of a Number */

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        int sum = 0;
        int rem = 0;

        while (num > 0 ) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of digits is : "+ sum);
        sc.close();
    }
}
