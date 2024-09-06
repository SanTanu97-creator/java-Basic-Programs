/*Java Program to Print Multiplication Table*/

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente table number: ");
        int num = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num+" X "+i+" = " + num * i);
        }
        sc.close();
    }
}
