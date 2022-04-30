package udemy.Lesson6;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number that needs to be reversed: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int newNumber = 0;
        while(number > 0){
            newNumber = newNumber * 10 + number%10;
            number = number/10;
        }
        System.out.println("Reversed number is: " + newNumber);
    }
    
}
