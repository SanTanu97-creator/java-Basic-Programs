/*Java Program to Check Whether a Number is Positive or Negative */

import java.util.Scanner;
public class Program_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is Positive");
        }
        sc.close();
    }
}
