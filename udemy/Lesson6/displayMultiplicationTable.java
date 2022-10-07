package udemy.Lesson6;

import java.util.Scanner;

public class displayMultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Print number that you want to have multiplication table: ");
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + number + " = " + number * i);
            }
        }

    }
}