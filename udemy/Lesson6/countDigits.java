package udemy.Lesson6;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
            int counter = 0;
            while (number > 0) {
                counter++;
                number = number / 10;
            }
            System.out.println(counter);
        }
    }
}
