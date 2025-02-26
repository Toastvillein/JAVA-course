package chapter2.interfaceexample.Assignment;

public class Aircon implements Switch {
        @Override
        public void switchOn() {
            System.out.println("에어컨이 켜집니다");
        }

        @Override
        public void switchOff() {
            System.out.println("에어컨이 꺼집니다");
        }
}
