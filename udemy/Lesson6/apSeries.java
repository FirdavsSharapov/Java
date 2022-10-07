package udemy.Lesson6;

import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Please enter startting number: ");
            int a = scan.nextInt();
            System.out.println("Please enter increment number: ");
            int b = scan.nextInt();
            System.out.println("Please enter number of itteration: ");
            int n = scan.nextInt();
            System.out.println();
            series(a, b, n);
            System.out.println();
            gpSeries(a, b, n);
            System.out.println();
            fibonacci(a);
        }
    }

    public static void series(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            System.out.print(sum + ", ");
            sum += b;
        }
    }

    public static void gpSeries(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            System.out.print(sum + ", ");
            sum *= b;
        }
    }

    public static void fibonacci(int number) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + "," + b +",");
        for (int i = 0; i < number-2; i++) {
            c = a + b;
            System.out.print(c + ",");
            a = b;
            b = c;
        }
    }
}
