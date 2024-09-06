
/*Java Program to Find the Sum of Even and Odd Numbers */

import java.util.Scanner;
public class Program_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sumOfEven = 0;
        int sumOfOdd = 0;
        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOfOdd += arr[i];
            }
        }

        System.out.println("Sum of Even numbers: " + sumOfEven);
        System.out.println("Sum of Odd numbers: " + sumOfOdd);
        sc.close();
    }
}