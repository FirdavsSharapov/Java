package udemy.Lesson7;

public class oneDimensionArray {
    public static void main(String[] args) {
        // Declaring / Creating array
        int empty_array[] = new int[5];
        // when we initialize an array they have default value of 0 in each 
        for(int i =0; i < empty_array.length; i++){
            System.out.println(empty_array[i]);
            empty_array[i] = i;
        }

        // other way to iterate through the loop in Java
        // it calls foreach method. you can itterate backwards in 
        // this method, only front itteration
        for(int x: empty_array){
            System.out.println(x);
        }
    }
    
}
