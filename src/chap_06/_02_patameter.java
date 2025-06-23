package chap06;

public class _02_patameter {
    // 전달값이 있는 메소드
    public static void power(int num) { // Parameter, 매개변수, 전달값
        int result = num * num;
        System.out.println(num + " 의 2승은 " + result);
    }

    public static void powerByExp(int num, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num; // result = result * num
        }
        System.out.println(num + " 의 " + exponent + " 승은 " + result);
    }
    public static void main(String[] args) {
        // 전달값 Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument 인수 = num = 2
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9
        power(81);

        powerByExp(2,3); // 2 * 2 * 2 = 8
        powerByExp(4,5); // 4 * 4 * 4 * 4 = 1024
        powerByExp(10, 0); // 1
    }
}
