package udemy.Lesson8;

public class MethodOverloadingPractice {
    public static void main(String[] args) {
        System.out.println(max(6f, 6f));
        System.out.println(max(2,3));
    }

private static int max(int x, int y){
    return x>=y ?x :y;
}

private static float max(float x, float y){
    return x>=y ?x :y;
}

}
