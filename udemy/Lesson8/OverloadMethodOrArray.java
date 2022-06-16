package udemy.Lesson8;

public class OverloadMethodOrArray {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 6, 10, 12, 3, 5, 4, 2 };
        int numb = 596101235;
        reverse(arr);
        reverse(numb);
    }

    public static void reverse(int n){
        int newNum = 0;
        while(n > 0){
            newNum = newNum *10 + n%10;
            n = n /10;
        }
        System.out.println("Reverser nuber is: " + newNum);
    }

    public static void reverse(int arr[]){
        int splitArrLen = arr.length / 2;
        for (int i = 1; i < splitArrLen+1; i++) {
            int tempFront = arr[i-1];
            arr[i-1] = arr[arr.length - i];
            arr[arr.length - i] = tempFront;
        }
        System.out.println("Reverser nuber is: " + arr[0]);
    }
}
