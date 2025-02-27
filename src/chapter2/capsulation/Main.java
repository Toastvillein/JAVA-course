package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {

        // 생성자 호출
        Person person = new Person("김영대");

        // 인스턴스 변수 접근
//        person.name = "김영대";
//        person.secret = ?


        // 인스턴스 메서드 접근
        person.mothodA();
//        person.mothodB(); = private으로 설정되어있기 때문에 접근 불가

        // 게터
        String name = person.getName();
        System.out.println("name = " + name);

        // 세터
        person.setName("Steve");
        String name2 = person.getName();
        System.out.println("name2 = " + name2);


    }
}
