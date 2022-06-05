package udemy.Lesson7;

/* Description: Rotate an array */
public class rotatingAnArray {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 6, 10, 12, 3, 5, 4, 2 };
        // output = [2,4,5,3,7,12,10,6,9,5]
        int splitArrLen = arr.length / 2;
        for (int i = 1; i < splitArrLen+1; i++) {
            int tempFront = arr[i-1];
            arr[i-1] = arr[arr.length - i];
            arr[arr.length - i] = tempFront;
        }
        System.out.println(arr);
    }
}
