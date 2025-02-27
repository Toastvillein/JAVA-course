package chapter2.capsulation;

public class Person {
    // 속성
    private String name;
    private String secret;

    // 생성자
     public Person(String name){  //만약 앞에 접근제어자를 두지 않으면 자동으로 default로 설정됨
         this.name = name;
     }



    // 기능
    public void mothodA(){

    }
    private  void methodB(){

    }

    // 게터
    public String getName() {
         return name;
    }

    //세터

    public void setName(String name) {
         this.name = name;
    }

}
