/*Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits */

import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char ch = sc.next().charAt(0);

        if(ch >= 65 && ch <= 96){
            System.err.println("Uppaercase");
        }
        else if(ch >= 97 && ch <= 123){
            System.out.println("Lowercase");
        }
        else if(ch >= 48 && ch <= 57){
            System.out.println("digit");
        }
        else{
            System.out.println("Others");
        }
        sc.close();
    }
}
