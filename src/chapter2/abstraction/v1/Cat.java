package chapter2.abstraction.v1;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("냐옹");

    }

    @Override
    public void exist() {
        System.out.println("고양이가 존재합니다");
    }

    public void scratch() {
        System.out.println("벅벅벅벅");
    }



}
