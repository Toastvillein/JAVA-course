package chapter1.operator;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 문자열을 입력하세요: ");
        String strBox1 = scanner.nextLine();

        System.out.print("두 번째 문자열을 입력하세요: ");
        String strBox2 = scanner.nextLine();
        
        boolean sameText = strBox1.equals(strBox2);
        System.out.println("두 문자열이 같은가요? " + sameText);

    }
}

