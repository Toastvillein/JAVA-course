package chapter2.interfaceexample.Assignment;

public class Tv implements Switch {
    @Override
    public void switchOn() {
        System.out.println("티비가 켜집니다");
    }

    @Override
    public void switchOff() {
        System.out.println("티비가 꺼집니다");
    }
}
