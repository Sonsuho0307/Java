package chap_04;

public class _09_MutipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2

        // 3 ...

        // 9 * 9 = 81

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

}