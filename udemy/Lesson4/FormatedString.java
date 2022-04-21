package udemy.Lesson4;

public class FormatedString {
    public static void main(String args[]){
        int x = 10;
        float y = 12.63f;
        char z ='A';
        System.out.printf("Hello %d %f %c", x,y,z);

        /****************
        Format specifier
        *****************/

        // Argument_Index
        System.out.printf("%1$d %2$f %1$d", x,y);
        // Benifit of this that we can use index of the argument in
        // a string 

        // Flags
        // - , + , 0,  ,(
        
       /*int a=10;//a=-10
        System.out.printf("%05d",a);*/
        
        /*float a=123.45f;//3.45f
        System.out.printf("%6.2f",a);*/
        
        String str="Java";
        System.out.printf("%20s",str);
    }
}
