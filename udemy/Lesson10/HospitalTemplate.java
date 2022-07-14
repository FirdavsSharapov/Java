package udemy.Lesson10;

abstract class Hospital{
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}

class Mimonedes extends Hospital{
    public Mimonedes(){
        System.out.println("My hospital name is Mimonedes");
    }

    public void emergency(){
        System.out.println("Emergency");
    }

    public void appointment(){
        System.out.println("appointment");
    }

    public void admit(){
        System.out.println("admit");
    }

    public void billing(){
        System.out.println("billing");
    }
}

public class HospitalTemplate {
    public static void main(String[] args) {
        Mimonedes MyHospital = new Mimonedes();
        MyHospital.admit();
        MyHospital.emergency();
    }
   
}
