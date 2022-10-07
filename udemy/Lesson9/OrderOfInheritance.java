package udemy.Lesson9;

// it will be run first
class Parent extends OrderOfInheritance {
    public Parent() {
        System.out.println("Parent constructor");
    }
}

// it will be run second since it's inheriting from Parent
class Child extends Parent {
    public Child() {
        System.out.println("Child constructor");
    }
}

// it will be run third since it's inheriting from Child, and child inheriting 
// from parent
class GrandChild extends Child {
    public GrandChild() {
        System.out.println("GrandChild constructor");
    }
}


public class OrderOfInheritance {
    public static void main(String[] args) {
        GrandChild c = new GrandChild();
        c.toString();
    }

}
