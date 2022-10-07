package udemy.Lesson8;

import java.util.Scanner;

public class PassingParameter {
    
    // new parameter
    static int add (int x, int y){
        int z;
        z = x+y;
        return z;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // calling add from main 
            System.out.print("Please add first number: ");
            int x = sc.nextInt();
            System.out.print("Please add second number: ");
            int y = sc.nextInt();

            System.out.println("Result of adding two numbers is: " + add(x,y));
        }
    }
}
