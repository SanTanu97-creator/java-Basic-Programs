/*Java Program to Increment by 1 to all the Digits of a Given Integer */

import java.util.Scanner;
public class Program_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10 + (num % 10);
            num /= 10;
        }

        int sum = 0;
        while (reverseNum != 0) {
            int rem = reverseNum % 10;
            rem++;
            System.err.println("incremented digit is :" + rem);
            sum += rem;
            reverseNum /= 10;
        }
        System.out.println("Sum of incremented Digits is: "+ sum);
        sc.close();
    }
}
