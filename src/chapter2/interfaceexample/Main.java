package chapter2.interfaceexample;

public class Main {
    public static void main(String[] args) {
        // 인스턴스화
        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        // 활용
//        luxuryCar.move();
//        luxuryCar.stop();

        // speedCar.move(); or speedCar.stop(); 은 불가능
        // speedCar.drive(); 이게 옳음

        // 인터페이스 활용
        luxuryCar.drive();
        speedCar.drive();

        speedCar.stop();
        luxuryCar.stop();

        luxuryCar.charge();
        speedCar.autoParking();
    }
}
