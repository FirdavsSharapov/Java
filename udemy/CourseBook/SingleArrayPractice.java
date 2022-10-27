package udemy.CourseBook;

public class SingleArrayPractice {
    public static void main(String[] args) {
        int myArray[] = { 1, 5, 3, 4, 5, 6, 3 };
        int maxValue = 0;
        int index = 0;
        if (myArray.length == 0) {
            System.out.println("Provided array doesn't contain any element");
        } else if (myArray.length == 1) {
            System.out.println("Max element is " + myArray[0]);
        } else {
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] > maxValue) {
                    index = i;
                    maxValue = myArray[i];
                }
            }
            System.out.println("Smallest index of the max value is " + index);
        }
        // arrayPractice();
        // arrayCopyPractice();
        // passingArrayInMethod(new int[] { 1, 2, 3, 4, 5 }); // there is no explicit reference caviable for thr array.
        //                                                    // Such array is caled annonymous
        // singleNumber(new int[] { 2, 2, 1 });
        // passingArrayInMethod2(new int[] { 1, 2, 3, 4, 5 });
        
        findError(new int[] { 1, 2, 3, 4, 5, 6 });
    
    }

    // Passing array in a methods
    /*
     * When passing an array to a method, the reference of the array is passed to
     * the method
     */
    private static void passingArrayInMethod(int[] arrName) {
        for (int element : arrName) {
            System.out.print(element + " ");
        }
    }

    private static void passingArrayInMethod2(int[] arrName) {
        System.out.println("Before invoing swap");
        System.out.println("Array is {" + arrName[0] + "," + arrName[1] + "}");
        swap(arrName[0], arrName[1]); // This is a false swap becasue the value in array is not getting changed
        System.out.println("Before invoing swapFirstTwoInArray");
        System.out.println("Array is {" + arrName[0] + "," + arrName[1] + "}");
        swapFirstTwoInArray(arrName);
    }

    private static void swap(int n1, int n2) {
        int temp = n1;
        n2 = n1;
        n1 = temp;
    }

    private static void swapFirstTwoInArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    public static void arrayPractice() {
        double[] aDouble = new double[10];
        aDouble[9] = 5.5;
        System.out.println(aDouble[0] + aDouble[1]);
    }

    public static void arrayCopyPractice() {
        int[] source = { 1, 2, 3 };
        int[] destination = new int[3];
        System.arraycopy(source, 0, destination, 0, source.length);
        for (int e : destination) {
            System.out.println(e);
        }
    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }


    private static void findError(int [] arrName){
        for (int i =0, j = arrName.length-1; i<arrName.length/2; i++, j--){
            int temp = arrName[i];
            arrName[i] = arrName[j];
            arrName[j] = temp;
        }

        for(int e:arrName){
            System.out.print(e);
        }
    }
}
