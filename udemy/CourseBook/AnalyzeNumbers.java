package udemy.CourseBook;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter number of elements: ");
            int n = sc.nextInt();
            double[] numbers = new double[n];
            double sum = 0;

            System.out.print("Please enter numbers: ");
            for(int i = 0; i < n; i++){
                numbers[i] = sc.nextInt();
                sum = sum + numbers[i];
            }

            int avg = (int) (sum / n);
            System.out.println("Avarage number is: " + avg);
            int count = 0;
            for(double e: numbers){
                if(e>= avg){
                    System.out.print(" " + e);
                    count ++;
                } 
            }

            System.out.println("Numbers of elements above the avg is: " + count);

        }
    }
}
