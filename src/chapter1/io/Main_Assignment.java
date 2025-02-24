package chapter1.io;
import java.util.Scanner;
public class Main_Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String strBox = scanner.nextLine();

        System.out.print("나이를 입력하세요: ");
        int intBox = scanner.nextInt();

        System.out.println("이름: " + strBox);
        System.out.println("나이: " + intBox);
    }
}
