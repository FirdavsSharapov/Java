package udemy.Lesson19;

// using 
class MyRunnable implements Runnable {
    public void run() { // you must ovirede run this in order to multi-threat
        int i = 1;
        while (i < 10) {
            System.out.println(i + " Hello worlds!");
            i++;
        }
    }
}

// same as runnable
class MyRunnableThreat extends Thread { 
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println(i + " Aloha");
            i++;
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        MyRunnableThreat mt = new MyRunnableThreat();
        // Thread tm = new Thread(mt);
        Thread t = new Thread(m); // running as multi treathing
        t.start();
        mt.start();
        int i = 1;
        while (i < 10) {
            System.out.println(i + " Hello Dolly");
            i++;
        }
    }
}
