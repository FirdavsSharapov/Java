package udemy.CourseBook;

import udemy.CustomLibrary.RandomCharacter;

/*
 * Ask is to:
 * 
 * 1. Generate 100 lowercase letters randomly and assign them to an array of characters. You can obtain
 * letter by using the getRandomLowerCaseLetter() method in the RandomCharacter class in Listing
 * 
 * 2. Count the occurances of each letter in the array. To do so, create an array , say counts of 26 int values,
 * each of which counts the occurances of the letter. Fo example counts[0] count the number of a's counts[1] 
 * counts the numbers of b's and so on.
 */

public class CoutingOccurancesOfEachLatter {
    // Main method 
    public static void main(String[] args) {
        // Declare and create an array
        char[] chars = createArray();

        // Display the array
        System.out.println("The lowercase letter are: ");
        displayArray(chars);

        // Count accurances of each letter
        int[] counts = displayCounts(chars);

        // Display counts 
        System.out.println();
        System.out.println("The occurances of each letters are: ");
        displayCounts(counts);
    }

    // Function that creates random characters
    private static char[] createArray(){
        char[] chars = new char[100];
        // Create lowercase characters randomly
        for(int i=0; i<100; i++){
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }

    // Function that displays array of characters
    private static void displayArray(char[] chars){
        for(int i=0; i<chars.length; i++){
            // here we're trying to split characters into 20 per row
            if((i+1) % 20 == 20)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] + " ");
            
        }
    }

    // Function that counts occurances of each character
    private static int[] displayCounts(char[] chars){
        // Declare and create new array
        int[] counts = new int [26]; // 26 english characters 
        for (int i=0; i<chars.length; i++){
            /*
             * The countLetters method (lines 46—55) returns an array of 26 int values, each of
             * which stores the number of occurrences of a letter. The method processes each letter in the
             * array and increases its count by one. A brute-force approach to count the occurrences of each
             * letter might be as follows:
             * ```
             * for (int i = 0; i < chars.length; i++)
             *  if (chars[i] == 'a')
             *    counts[0]++;
             *  else if (chars[i] == 'b')
             *    counts[1]++;
             * ...
             * ```
             * So better solution here if the letter (chars[i]) is a, the corresponding count is counts['a' − 'a'] (i.e.,
             * counts[0]). If the letter is b, the corresponding count is counts['b' − 'a'] (i.e.,
             * counts[1]), since the Unicode of b is one more than that of a. If the letter is z, the
             * corresponding count is counts['z' − 'a'] (i.e., counts[25]), since the Unicode of z is
             * 25 more than that of a.
             */
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    // Function that displays the count
    private static void displayCounts(int[] counts){
        for(int i =0; i<counts.length; i++){
            if((i+1)%10 == 0){
                System.out.println(counts[i] + "-" + (char)(i+'a'));
            }else{
                System.out.print(counts[i] + "-" + (char)(i+'a') + " | ");
            }
        }
    }

}
