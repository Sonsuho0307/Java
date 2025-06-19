package 객체지향;

public class _6_20_MyMath {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.max(5, 3);
        long result1 = mm.add(5, 3);
        long result2 = mm.subtract(5, 3);
        long result3 = mm.multiple(5, 3);
        double result4 = mm.divide(5, 3);
        mm.printGugudan(3);

        System.out.println("max(5, 3) = " + result);
        System.out.println("add(5, 3) = " + result1);
        System.out.println("suvtract(5, 3) = " + result2);
        System.out.println("multiple(5, 3) = " + result3);
        System.out.println("divide(5, 3) = " + result4);
    }

}

class MyMath {
        void printGugudan(int dan) {
            if (!(2<=dan && dan <=9))
                return; // 입력받은 단(dan)이 2 ~ 9 가 아니면, 메소드 종료하고 돌아가기
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d%n", dan, i, dan * i);
            }
          //  return;  원래 return을 적어야 하지만 반환타입이 void기 때문에 생략 가능
        }

    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b; 위 두 줄을 이렇게 요약가능
    }

    // 두 값을 받아서 둘 중 큰 값을 반환하는 메서드를 작성하시오
    long max(long a, long b){
        if(a > b)
            return a; // 조건식이 참일 때만 실행. 거짓일 수도 있어서 오류가 난다.
        else
            return b; // 조건식이 거짓일 때 실행
    }
    long subtract(long a, long b) { return a - b; }
    long multiple(long a, long b) { return a * b; }
    double divide(double a, double b) {
        return a / b;
    }
}