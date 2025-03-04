package chapter1.loop;
import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요 (2~9): ");
        int dan = sc.nextInt();

        // 2~9 사이의 숫자인지 확인
        if (2<=dan && dan<=9) {
            System.out.println("==== " + dan + "단 ====");
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        } else {
            System.out.println("잘못된 접근입니다.");
        }
    }
}