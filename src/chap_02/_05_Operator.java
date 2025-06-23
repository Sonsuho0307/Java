package chap_02;

public class _05_Operator {
    public static void main(String[] args) {
        // 삼항 연산자
//        결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max); //5

        int a = 4;
        int b = 6;
        int min = (a < b) ? a : b;
        System.out.println(min); //4

        boolean c = (x == y) ? true : false;
        System.out.println(c);

        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s); // 달라요

    }
}
