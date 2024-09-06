/*Java Program to Print Binary Equivalent of an Integer using Recursion */

import java.util.Scanner;

public class Program_21 {

    String Binary(int x) {
        if (x > 0) {
            int r = x % 2;
            x /= 2;
            return r + "" + Binary(x);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number : ");
        int num = sc.nextInt();
        Program_21 obj = new Program_21();
        String binary = obj.Binary(num);
        System.out.println("Binary of " + num + " is : " + binary);
        sc.close();
    }
}
