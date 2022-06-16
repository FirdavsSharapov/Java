package udemy.Lesson8;

public class PassingMultipleParams {
    public static void main(String[] args) {
        multiParam(10,20,30,40,50,60);
    }

    private static void multiParam(int ...x){ // this means that you can pass multiple arguments by declaring like this
        // to access that we can itterate through the x and get each argument
        for(int a:x){
            System.out.println(a);
        }
    }
}
