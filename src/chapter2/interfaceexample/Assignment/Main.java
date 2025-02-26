package chapter2.interfaceexample.Assignment;

public class Main {
    public static void main(String[] args) {
        Aircon aircon = new Aircon();
        Computer computer = new Computer();
        Tv tv = new Tv();

        aircon.switchOn();
        computer.switchOn();
        tv.switchOn();
        aircon.switchOff();
        tv.switchOff();
    }
}
