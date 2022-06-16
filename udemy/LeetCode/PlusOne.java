package udemy.LeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = { 9 };
        changeLast(arr); 
    }

    private static void changeLast (int arr[]){
        int number = arr[arr.length-1];
        int[] array;
        if (arr.length != 0){
        if (number == 9){
            array = Arrays.copyOf(arr, arr.length + 2);
            array[array.length -1] = 1;
            array[array.length -1] = 0;
        }
        }else{
            array = Arrays.copyOf(arr, arr.length + 1);
            array[array.length -1] = number + 1;
        }
        // arr = array;
        for(int x: arr){
           System.out.print(x);     
        }
    }
}
