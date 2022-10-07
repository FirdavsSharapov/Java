package udemy.Lesson6;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        try (Scanner scan = new Scanner(System.in)) {
            int number = scan.nextInt();
            int orgNumber = number;
            int newNumber = 0;
            while(number > 0){
                newNumber = newNumber * 10 + number%10;
                number = number/10;
            }
            if (newNumber == orgNumber){
                System.out.println("Number " + orgNumber + " is polindrome");
            }else{
                System.out.println("Number " + orgNumber + " is not a polindrome");
            }
        }
    }
    
}
