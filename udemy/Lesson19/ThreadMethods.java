package udemy.Lesson19;
// In this lesson we are going to learn thread methods
class MyRun implements Runnable{
    public void run(){

    }
}

// another way to call methods of the threads is to extend super class of Thread
class MyThread extends Thread{
    // calling the constructor of the class
    public MyThread(){ // constructor take one param which is name and passes to super class
        setPriority(MAX_PRIORITY);
    }  
}
public class ThreadMethods {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new MyRun(), "my thread name"); // we can give thread a name so we can identify them  by name
        MyThread tt = new MyThread();
        tt.setName("BS");
        System.out.println(tt.getId());
        System.out.println(tt.getName());
        System.out.println(tt.getState());
        System.out.println(tt.getPriority());
        System.out.println(tt.isAlive());
        System.out.println(t.getName());
    }
}
