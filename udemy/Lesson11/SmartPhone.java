package udemy.Lesson11;

class IPhone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("Click from Camera Interface was called");
    }

    public void record() {
        System.out.println("Record from Camera Interface was called");
    }

    public void play() {
        System.out.println("Play from MusicPlayer Interface was called");
    }

    public void stop() {
        System.out.println("Stop from MusicPlayer Interface was called");
    }
}

public class SmartPhone {
    public static void main(String[] args) {
        IPhone phn = new IPhone();
        phn.click();
        phn.play();
        phn.stop();
        phn.record();
    }
}
