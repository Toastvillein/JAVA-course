package chapter2.clazz;

import com.sun.org.apache.xerces.internal.util.XMLInputSourceAdaptor;

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
