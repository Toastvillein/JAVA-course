package chapter2.clazz;

public class Car {
    String carName;
    int carNumber;

    Car(String carName, int carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    void drive() {
        System.out.println(carName+carNumber +"은(는) 주행중");
    }

}
