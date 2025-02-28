package chapter3.exception.Assignment;
import java.util.Scanner;

import static chapter3.exception.Assignment.LogIn.login;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogIn logIn = new LogIn();

        while (true) {
            try {
                System.out.print("아이디를 입력해주세요: ");
                String id = scanner.nextLine();

                System.out.print("비밀번호를 입력해주세요: ");
                String pwd = scanner.nextLine();

                logIn.login(id, pwd);
                System.out.println("로그인 되었습니다.");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
