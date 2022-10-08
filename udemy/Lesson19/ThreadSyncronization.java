package udemy.Lesson19;

class MyData {
    // by doing syncronized I'll tell threat to access method only for one call
    // object
    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}

class HelloThread extends Thread{
    MyData d;
    public HelloThread(MyData d){
        this.d = d;
    }

    public void run(){
        d.display("Hello world");
    }
}

class WelcomeThread extends Thread{
    MyData d;
    public WelcomeThread(MyData d){
        this.d = d;
    }

    public void run(){
        d.display("Welcome world");
    }
}

public class ThreadSyncronization {
    public static void main(String[] args) {
        MyData d = new MyData();
        HelloThread ht = new HelloThread(d);
        WelcomeThread wt = new WelcomeThread(d);
        ht.start();
        wt.start();
    }
}
