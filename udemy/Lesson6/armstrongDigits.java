package udemy.Lesson6;
import java.util.Scanner;

public class armstrongDigits {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check if it's Armstrong number or not: ");
        Scanner scan = new Scanner(System.in);
        int enteredNumber = scan.nextInt();
        int comparedNum = enteredNumber;
        int sumOfArmstrong = 0;
        while (enteredNumber > 0){
            int lastNum = enteredNumber%10;
            enteredNumber = enteredNumber/10;
            sumOfArmstrong += Math.pow(lastNum, 3);
        }
        if(comparedNum == sumOfArmstrong){
            System.out.println("Entered number is Armstrong number");
        }else{
            System.out.println("Entered number is not Armstrong number");
        }
    }
}