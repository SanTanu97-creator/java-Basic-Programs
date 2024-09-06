/*Java Program to Check Whether a Character is a Vowel, Consonant or Digit */

import java.util.Scanner;
public class Program_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any charactre: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The character is vowel: ");
        }
        else{
            System.out.println("The character is consonent");
        }
        sc.close();
    }
}
