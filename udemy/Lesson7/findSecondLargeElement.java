package udemy.Lesson7;

import java.util.Scanner;

public class findSecondLargeElement {
    public static void main(String[] args) {
        int arr_elements[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
        // System.out.println("Sum of the all elements from the array is: " + findSumOfAllElements(arr_elements));
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Please enter a number that you you want to search: ");
        // int searchNum = scan.nextInt();
        // System.out.println("You searching number " + searchingElement(arr_elements, searchNum) + " in array");
        // System.out.println("Maximum number of element is: " + findMaxElement(arr_elements));
        findingSecondLargestElement(arr_elements);

    }

    public static int findSumOfAllElements(int arr[]) {
        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        return sum;
    }

    public static String searchingElement(int arr[], int searchNum){
        for(int x: arr){
            if(x == searchNum){
                return "exist";
            }
        }
        return "not exist";
    }

    public static int findMaxElement(int arr[]){
        int maxElement = 0;
        for(int x: arr){
            if(x > maxElement){
                maxElement = x;
            }
        }  
        return maxElement;
    }

    public static void findingSecondLargestElement(int arr[]){
        int maxElement = 0;
        int secondLarge = 0;
        for(int x: arr){
            if(x > maxElement){
                secondLarge=maxElement;
                maxElement = x;
            }else if(x > secondLarge) {
                secondLarge = x;
            }
        }
        System.out.println("Second largest element is: " + secondLarge);
    }
}
