package chapter1.array;

public class Assignment3 {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    // if는 자동으로 true값을 반환하기 때문에 따로 board[][] = true 조건을 붙이지 않아도 된다.
                    System.out.println("검은돌(●) 위치: "+i+" "+j);
                }
            }
        }
    }
}
