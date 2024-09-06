/*Java Program to Find the Largest Number Among Three Numbers */

import java.util.Scanner;
public class Program_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Enter three number: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is larger");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+ " is larger");
        }
        else{
            System.out.println(num3+ " is larger");
        }

        sc.close();
    }
}
