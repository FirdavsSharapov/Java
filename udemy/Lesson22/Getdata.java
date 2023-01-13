package udemy.Lesson22;

class Data <T>{
    private T obj;
    public void setData(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }

}
class MyArray<T>{
    // T A[] =(T[] new Object[10]);
}

public class Getdata<T> {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        // d.setData(new Integer(20));
        System.out.println(d.getData());
    }
}
