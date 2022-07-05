package udemy.Lesson9;

public class ParametrizedConstructor {
    public static void main(String[] args) {
        final Child c = new Child();
    }
}

class Parent {
    Parent() {
        System.out.println("Non-param of parent");
    }

    /**
     * @param someWord
     */
    Parent(String someWord) {
        System.out.println("Param of parent " + someWord);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Non-param of Child");
    }

    Child(String someWord) {
        System.out.println("Param of Child " + someWord);
    }
}