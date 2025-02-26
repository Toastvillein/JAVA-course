package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person();

        // 인스턴스 변수 접근
        person.name = "김영대";
//        person.secret = ?


        // 인스턴스 메서드 접근
        person.mothodA();
//        person.mothodB();

    }
}
