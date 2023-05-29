package udemy.Lesson25;

import java.util.*;

public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.forEach((x)->System.out.println(x));

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.offerFirst(80);

        dq.forEach((x)->System.out.println(x));
    }

}
