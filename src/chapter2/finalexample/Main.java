package chapter2.finalexample;

public class Main {
    public static void main(String[] args) {

        // final 활용 방법
        final int a= 1;
//        a = 2;
        System.out.println("a = " + a);

        // 상수 활용 방법
        System.out.println("상수 활용: "+Circle.PI);
        
        // 불변 객체 할용
        final Circle c = new Circle(2);
        // c = new Circle(5); < 참조 변경을 막지만 내부 상태는 막지 않음
        // c.radius = 5;
        System.out.println("c = " + c);

        // 불변 객체의 내부상태가 변경이 필요한 경우
        Circle c2 = new Circle(10);  // 생성자
        Circle c3 = c2.changeRadius(20);  // 기능을 활용

    }
}
