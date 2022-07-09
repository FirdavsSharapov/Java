package udemy.Lesson10;

abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }

    public void meth1() {
        System.out.println("Meth1 of Super");
    }

    // abstract method declared here. you MUST override this in SubClass otherwise
    // it will throw
    // you a linter error
    abstract void meth2();
}

class Sub extends Super {
    /* 
     * It was overided from Super class
     */
    @Override
    public void meth2() {
        System.out.println("Abstract method from Super class was overided in Sub class");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.meth1();
        s.meth2();
    }
}
