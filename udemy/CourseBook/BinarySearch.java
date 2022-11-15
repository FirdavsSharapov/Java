package udemy.CourseBook;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13 };
        System.out.println(searchElement(array, 10));
    }

    private static int searchElement(int[] array, int element) {

        int low = 0;
        int high = array.length; // taking last element from array

        while (high >= low) {
            int mid = (low + high) / 2;
            if (array[mid] > element) {
                high = mid - 1;
            } else if (array[mid] == element) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }
}
