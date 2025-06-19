package chap06;

public class _04_ParamrterAndReturn {

    public static int getPower (int num) {
        int result = num * num;
        return result;
        // retutn num * num <- 위 두 줄과 같은 값이 나온다. 한 줄로 생략 가능
    }

//    public static void powerByExp(int num, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= num; // result = result * num
//        }
//        System.out.println(num + " 의 " + exponent + " 승은 " + result);

    public static int getPowerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= num; // result = result * num
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
       int retVal =  getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(6);
        System.out.println(retVal); // 6 * 6 = 36

        retVal = getPowerByExp(3,4);
        System.out.println(retVal); // 3 * 3 * 3 * 3 = 81
        // 위 아래 같은 값이 나온다
        System.out.println(getPowerByExp(3,4));
    }
}
