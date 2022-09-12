package udemy.Lesson19;

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello ");
            i++;
        }
    }

    class MultiThreadingClassExample {
        public static void main(String[] args) {
            MyThread t = new MyThread(); // starting the thread
            t.start(); // ditto
            int i = 1;
            while (true) {
                System.out.print(i + "world");
                i++;
            }

        }
    }
}