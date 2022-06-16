package udemy.Lesson8;

public class FindGDC {
    public static void main(String[] args) {
        System.out.println(GCD2(366,60));
    }

    // recursion with 17 operations
    public static int GCD(int m, int n){
        if (m>n){
            m = m - n;
            return GCD(m, n);
        }else if(m<n){
            n = n -m;
            return GCD(m, n);
        }else {
        return m;
        }
    }

    // recursion with 3 operations
    public static int GCD2(int m, int n){
        if (n != 0 ){
            return GCD2(n, m%n);
        }else{
            return m;
        }
    }
}
