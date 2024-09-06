/*Java Program to Check if Two Numbers are Equal */

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Emter two Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("Numbrs are eqal...");
        }
        else{
            System.out.println("Numbrs are not eqal...");
        }
        sc.close();
    }
}
