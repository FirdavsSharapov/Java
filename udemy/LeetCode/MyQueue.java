package udemy.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    public static void main(String[] args) {

    }
}

class QueueEx {
    // store elements
    private List<Integer> data;
    private int p_start;

    // constructor/ a pointer to indicate the start position
    public QueueEx() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    /*
     * Insert an element into the queue. Return true if the operation is successful.
     */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    /*
     * Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    /** Checks whether the queue is empty or not. */
    public boolean isEmpty() {
        return p_start >= data.size();
    }

    /** Get the front item from the queue. */
    public int Front() {
        return data.get(p_start);
    }
}