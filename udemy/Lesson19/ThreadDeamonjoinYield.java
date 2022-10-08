package udemy.Lesson19;

class MyThread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i++);
        }
    }
}

public class ThreadDeamonjoinYield {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();
        try{
            Thread.sleep(100);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
