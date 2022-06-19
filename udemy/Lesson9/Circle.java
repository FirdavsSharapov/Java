package udemy.Lesson9;

public class Circle {
    //properties
    private int radius;
    
    //geter
    int getRadius(){
        return radius;
    }

    //setter
    void setRadius(int r){
        if (r>0){
        radius = r;
        }else{
            radius =0;
        }
    }


    // methods/functions
    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumfrence(){
        return perimeter();
    }
}

//Type of properties

//  1. Read & Write
//  2. Read only        
//  3. Write only