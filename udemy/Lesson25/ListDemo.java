package udemy.Lesson25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> arrList1 = new ArrayList<>(20); // Create an array with size of ten
        ArrayList<Integer> arrList2 = new ArrayList<>(20);
        arrList1.add(10); // this will store element 10 in first index of array
        // arrList1.add(10,9); // this will store element 9 in index 10
        arrList2.add(10);
        arrList2.add(20);

        // Itterator method allows to forward directional method
        Iterator<Integer> it = arrList2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // ListIterator method allows bi directional methods 
        ListIterator<Integer> lIt = arrList2.listIterator();
        while(lIt.hasNext()){
            System.out.println(lIt.next());
        }

        // this is a lambda method of itteration
        arrList2.forEach(n->show(n));
    }

    static void show(int n){
        if(n>15){
            System.out.println(n);
        }
    }
}