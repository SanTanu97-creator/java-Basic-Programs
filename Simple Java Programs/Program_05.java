/*Java Program to Swap Two Numbers */

import java.util.Scanner;;

public class Program_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        num2 = sc.nextInt();

        System.out.println("====Before swapping====");
        System.out.println("num1 is : " + num1);
        System.out.println("num2 is : " + num2);

        System.out.println("====After swapping====");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 is : " + num1);
        System.out.println("num2 is : " + num2);

        sc.close();
    }
}
