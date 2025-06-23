package chap06;

public class _05_OverLoading {
        public static int getPower (int num) {
            int result = num * num;
            return result;
            // retutn num * num <- 위 두 줄과 같은 값이 나온다. 한 줄로 생략 가능
        }

        public static int getPower (String strNumber) {
            int number = Integer.parseInt(strNumber);
            return number * number;
        }

        public static int getPower(int num, int exponent){
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= num; // result = result * num
            }
            return result;
        }

        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달 값의 타입이 다르거나
        // 2. 전달 값의 갯수가 다르거나
        public static void main(String[] args) {
            System.out.println(getPower(3));
            System.out.println(getPower("4"));
            System.out.println(getPower(3,3));
    }

}
