package udemy.Lesson21;


@FunctionalInterface
interface MyLambda{
    public int add(int x, int y);
}

public class LambdaExpression {
    public static void main(String[] args) {
        MyLambda m=(a,b)->a+b;
        int r=m.add(4, 5);
        System.out.println(r);
    }
    
}
