package chapter2.interfaceexample.Assignment;

public class Computer implements Switch {
    @Override
    public void switchOn() {
        System.out.println("컴퓨터가 켜집니다");
    }

    @Override
    public void switchOff() {
        System.out.println("컴퓨터가 꺼집니다");
    }
}
