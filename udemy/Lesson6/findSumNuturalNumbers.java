package udemy.Lesson6;

import java.util.Scanner;

public class findSumNuturalNumbers {
    public static void main(String[] args){
        System.out.println("Print natural number: ");
        Scanner scan = new Scanner(System.in);
        int naturalNumber = scan.nextInt();
        int sum = 0;
        for(int i=1; i<=naturalNumber; i++){
            sum = sum + i;
        }
        System.out.println("Sum of natural number of " + naturalNumber + " is " + sum);
    }

}
