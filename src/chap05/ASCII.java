package chap05;

public class ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) :  미국 표준 코드
        char c = 'A'; // * 알파벳 대문자는 65 부터 시작, 소문자는 97, 숫자는 48부터 ( 0 = 48 )
        System.out.println(c); // 결과값 A
        System.out.println((int)c);  // 결과값 65 - 아스키 코드

        c = 'B';

        System.out.println(c); // 결과값 B
        System.out.println((int)c); // 결과값 66 - 아스키 코드


        c++;

        System.out.println(c); // 결과값 c
        System.out.println((int)c); // 결과값 67 - 아스키 코드


        String[][] seats3 = new String[10][15];
                char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;

        }



        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3.length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }


    }
}
