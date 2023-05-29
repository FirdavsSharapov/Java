package udemy.Lesson25;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> lList1 = new LinkedList<>(List.of(10,20,30,40,50,60));
        System.out.println(lList1.size());
    }
}
