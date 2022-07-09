package udemy.Lesson9;

class Car {
    public void Drive(){
        System.out.println("Function of Car Driving was called");
    }

    public void Start(){
        System.out.println("Function of Car Start was called");
    }

    public void Stop(){
        System.out.println("Function of Car Stop was called");
    }
}

class LuxCar extends Car{
    @Override
    public void Start(){
        System.out.println("Function of Car Start Through button was called");
    }
}

public class MethodOverridingCar {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.Drive();
        cr.Start();
        cr.Stop();

        LuxCar lc = new LuxCar();
        lc.Start();
    }
}
