package chapter1.array;

public class Assignment1 {
    public static void main(String[] args) {
        int[] arr = {3,4,7,10,15,20};

        System.out.print("짝수: ");

        for (int a : arr) {
            if (a % 2 == 0) {
                System.out.print(a+" ");
            }
        }
    }
}
