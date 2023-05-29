package udemy.Lesson25;
import java.util.*;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(20,0.25f);
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);
        System.out.println(hs);
        treeSet();
    }

    public static void treeSet(){
        TreeSet<Integer> ts = new TreeSet<>((List.of(10,20,30,40,50,60,50,30)));
        System.out.println(ts);
    }
}
