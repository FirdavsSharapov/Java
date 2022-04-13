package udemy.Lesson1;

import java.util.Scanner;

/* Class Scanner
nextInt()
nextFloat()
nextDouble()
next()
nextLine()
nextByte()
nextShort()
nextLong()
nextBoolean()
hasNextInt()
hasNextFloat()
*/

public class Keyboard {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("May I know your name?");
            String name = sc.nextLine();
            System.out.println("Welcome Mr. / Ms. " + name);
        }
    }

}