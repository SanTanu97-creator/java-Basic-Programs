/*Java Program to Extract Digits from a Given Number*/

import java.util.Scanner;

public class Program_10 {

    public static void main(String args[]) {
        int n, m, a, counter = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        while (m > 0) {
            a = m % 10;
            System.out.println("Digits at position " + counter + ":" + a);
            m = m / 10;
            counter--;
        }
        s.close();
    }
}
