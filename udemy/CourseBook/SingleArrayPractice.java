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
    }

    public static void 
}
