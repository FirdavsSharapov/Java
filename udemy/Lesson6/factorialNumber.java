package udemy.Lesson6;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        System.out.println("Enter number that calculates factorial: ");
        Scanner scan = new Scanner(System.in);
        int factorial = scan.nextInt();
        int sum = 1;
        for (int i = 1; i <= factorial; i++) {
            sum = sum * i;
        }
        System.out.println("Factorial of the " + factorial + " is " + sum);
    }
}
