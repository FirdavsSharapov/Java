package udemy.Lesson11;

interface Test{
    void method1();
    void method2();
}

class MyInher implements Test{
    public void method1(){
        System.out.println("Method 1 get called");
    }
    public void method2(){
        System.out.println("Method 2 get called");
    }
    public void method3(){
        System.out.println("Method 2 get called");
    }
}
public class InterfacePractice {
    public static void main(String[] args) {
        MyInher inher = new MyInher();
        inher.method1();
        inher.method2();
        inher.method3();
    }
}
