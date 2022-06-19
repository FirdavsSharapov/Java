package udemy.Lesson9;

public class Shapes {
  public int height;
  public int width;
  
  public double lidArea(){
    return height;
  }

  public static void main(String[] args) {
    Circle cir = new Circle();

    cir.setRadius(10);
    System.out.println(cir.area());
  }
}

