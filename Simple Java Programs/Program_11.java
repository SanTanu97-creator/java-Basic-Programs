/* java program to reverse a number */

import java.util.Scanner;
public class Program_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        int rem = 0;
        int reverseNum = 0;
        if(num == 0){
            System.out.println("Reverse number is: " + num);
        }
        while (num != 0) {
            rem = num % 10;
            reverseNum = reverseNum * 10 + rem;
            num /= 10;
        }
        System.out.println("The reverse number is : " + reverseNum);
        sc.close();
    }
}
