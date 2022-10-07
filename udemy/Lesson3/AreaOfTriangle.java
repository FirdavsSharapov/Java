package udemy.Lesson3;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter Height of triangle: ");
            float height = sc.nextInt();
            System.out.println("Please enter Base of the trinagle: ");
            float base = sc.nextInt();
            float calculation = 0.5f*base*height;
            System.out.println("Area of the trinagle is: " + calculation);
        }
    }
    
}