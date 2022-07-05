package udemy.Lesson9;

public class ThisAndSuper {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20,10);
        Rectangle r2 = new Rectangle(2,1);
        r1.Display();
        r2.Display();
    }

}

// to avoid property name conflict we use this in properties of the class

class Rectangle{
    int length;
    int depth;

    public Rectangle(int l, int d){
        this.length = l;
        this.depth = d;
    }
    void Display(){
        System.out.println("Length " + this.length);
        System.out.println("Depth " + this.depth);
    }
}
