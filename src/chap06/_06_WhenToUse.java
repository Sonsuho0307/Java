package chap06;

public class _06_WhenToUse {
    public static int getPower (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // result = result * num
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

//        // 2의 2승을 구하기
        System.out.println(getPower(2,2));
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 2; // result = result * num
//        }
//        System.out.println(result); // 2 * 2 = 4
//
//        // 3의 3승을 구하기
        System.out.println(getPower(3,3));
//        result = 1;
//        for (int i = 0; i < 3; i++) {
//            result *= 3; // result = result * num
//        }
//        System.out.println(result); // 3 * 3 * 3 = 27
//
//        // 4의 2승을 구하기
        System.out.println(getPower(4,2));
//        result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 4; // result = result * num
//        }
//        System.out.println(result);

    }
}
