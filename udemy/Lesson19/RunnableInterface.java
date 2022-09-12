package udemy.Lesson19;

class MyRunnable implements Runnable{
    public void run(){
        int i = 1;
        while(i< 10){
            System.out.println(i + " Hello worlds!");
            i++;
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        int i = 1;
        while(i< 10){
            System.out.println(i + " Hello Dolly");
            i ++;
        } 
    }
}
