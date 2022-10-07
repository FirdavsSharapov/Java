package udemy.Lesson13;

class Test
{
    static int x = 20;
    int y =30;

    void show(){
        System.out.println(x + " " + y);
    }

    static void display()
    {
        System.out.println(x);
    }
}

public class StaticMethodPractice{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        Test.x = 40;
        t1.y = 60;

        Test t2 = new Test();
        t2.show();
    }
}