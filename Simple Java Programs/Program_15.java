/*Java Program to Print Multiplication Table using recursion*/

import java.util.Scanner;

public class Program_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Table Number: ");
        int num = sc.nextInt();
        Program_15 obj = new Program_15();
        obj.MultiTable(num, 1); // Start the table from 1
        sc.close();
    }

    void MultiTable(int num, int i) {
        // Base case to stop recursion
        if (i > 10) {
            return;
        }
        
        // Print the multiplication table line
        System.out.println(num + " x " + i + " = " + (num * i));
        
        // Recursive call with incremented i
        MultiTable(num, i + 1);
    }
}
