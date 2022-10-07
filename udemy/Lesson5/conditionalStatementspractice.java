package udemy.Lesson5;

import java.util.Scanner;

public class conditionalStatementspractice {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Find number is odd or even
            System.out.println("Please enter a number: ");
            int num = scan.nextInt();
            if (num % 2 == 1) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }

            // find person is young or not
            System.out.println("Please enter a person's age: ");
            int age = scan.nextInt();
            if (age <= 15) {
                System.out.println("person is young");
            } else {
                System.out.println("person is not young");
            }

            // find grades for given marks
            System.out.println("Please enter marks: ");
            int mark = scan.nextInt();
            if (mark <= 1) {
                System.out.println("A");
            } else {
                System.out.println("person is not young");
            }
        }
    }
}
// VIKA PRIVET