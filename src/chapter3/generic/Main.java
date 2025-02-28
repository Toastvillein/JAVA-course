package chapter3.generic;

public class Main {
    public static void main(String[] args) {

        // 1. 재사용 불가
        Box box1 = new Box(100);
//        new Box("ABC");
//        new Box(0.1);

        // 2. 낮은 타입 안정성
        ObjectBox intBox = new ObjectBox(100);
        ObjectBox strBox = new ObjectBox("ABC");

        // item 을 활용하기 위해서는 down casting 필요
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem();

        // 제네릭 활용
        // 1. 재사용성 보장(타입소거: T -> Object)
        GenericBox<String> strGBox = new GenericBox<String>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<Integer>(123);
        GenericBox<Double> doubleGBox = new GenericBox<Double>(0.4);

        // 2. 타입 안정성 보장(타입소거: 자동으로 down casting 삽입)
        String item1 = strGBox.getItem();
        System.out.println("item1 = " + item1);

        Integer item2 = intGBox.getItem();
        System.out.println("item2 = " + item2);

        Double item3 = doubleGBox.getItem();
        System.out.println("item3 = " + item3);

        // 일반 메서드(String 기준으로 타입 소거 발생)
        strGBox.printBox("ABC");
//        strGBox.printBox(100);
//        strGBox.printBox(0.1);

        // 제네릭 메서드(String과 상관 없음)
        strGBox.printBox2("ABC");
        strGBox.printBox2(123);
        strGBox.printBox2(0.1);

    }
}
