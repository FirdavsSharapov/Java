package udemy.Lesson9;

class Super {
    public void display(){
        System.out.println("Super Class Display");
    }
}

class Sub extends Super{

    public void display(int x){
        System.out.println("Sub Class Display");
    }
}

public class MethodOverriding extends Super{
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub s = new Sub();
        s.display();

        Super sup1 = new Sub();
        sup1.display();
    }
}
