package udemy.Lesson8;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to find out if it's prime or not: ");
        int num = scan.nextInt();
        System.out.println(num + " " + isPrime(num) + " prime number");
    }

    static boolean isPrime(int num) {
        for (int fac = 2; fac <= num/2; fac++) {
            if (num % fac == 0) {
                return false;
            }
        }
        return true;
    }
}
