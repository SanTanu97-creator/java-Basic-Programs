/* Java Program to Find Sum of Digits of a Number using Recursion */
import java.util.Scanner;

public class Program_09 {

    int sum = 0;
    int sumOfDigit(int num) {
        sum = num % 10;
        // Base case
        if (num == 0) {
            return 0;
        }
        else{
        // Recursive case
        return sum + sumOfDigit(num / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        // Create an instance of the Program_09 class
        Program_09 obj = new Program_09();
        
        // Call the sumOfDigit method and store the result
        int sum = obj.sumOfDigit(num);
        
        // Print the result
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
