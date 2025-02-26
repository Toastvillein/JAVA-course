package chapter1.method;

public class Main {
    public static void main(String[] args) {
        // 1. 객체를 객체화(소환)
        Calcaulator calcaulator = new Calcaulator();
        //  int         a       =  1;
        // [계산기]    계산기     = 계산기

        // 1. 메서드(함수)를 호출
        int result = calcaulator.sum(1,3);
        System.out.println("result = " + result);
    }
}
