package udemy.LeetCode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        Integer[] intArray = {-4,-1,0,3,10};
        System.out.println(sortedSquares(intArray));
    }
    public static Integer[] sortedSquares(Integer[] intArray) {
        for(int i=0; i<intArray.length; i++){
            int temp = intArray[i] * intArray[i];
            intArray[i] = temp;
            System.out.println(temp);
        }
         Arrays.sort(intArray);
        return intArray;
    }
}
