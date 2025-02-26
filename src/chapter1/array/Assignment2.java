package chapter1.array;

public class Assignment2 {
    public static void main(String[] args) {
        int[] arr = {2,5,8};
        int sum = 0;

        for (int a : arr) {
            sum += a;
        }

        System.out.println("누적합: " + sum);
    }
}
