/*Java Program to Find the Number of Integers Divisible by 5 */

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter numbrs: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] % 5 == 0) {
                System.out.println(arr[i] + " is divisible by 5");
            } else {
                System.out.println(arr[i] + " is not divisible by 5");
            }
        }
        sc.close();
    }
}
