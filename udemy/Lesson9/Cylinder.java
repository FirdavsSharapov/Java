package udemy.Lesson9;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        height = 0.0;
    }

    public double volume(){
        return area()*height;
        
    }
}
