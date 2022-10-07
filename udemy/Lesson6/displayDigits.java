package udemy.Lesson6;

import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        try (Scanner digit = new Scanner(System.in)) {
            int number =digit.nextInt();
            int reminder=0;
            while(number>0){
                reminder=number%10;
                System.out.println(reminder);
                number=number/10;
                System.out.println(number);
            }
        }

    }
    
}
