/*Java Program to Print Binary Equivalent of an Integer */

import java.util.Scanner;
public class Program_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any decimal number: ");
        int num = sc.nextInt();
        int binary = 0;
        while (num > 0) {
            int r = num % 2;
            num /= 2;
            binary = binary * 10 + r;
        }
        System.out.println("Binary of "+num+" is : "+ binary);
        sc.close();
    }
}
