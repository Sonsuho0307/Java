package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5 는 3 보다 크다 참이면 true 거짓이면 false
        System.out.println(5 >= 3); // 5 는 3 보다 크거나 같다
        System.out.println(5 >= 5); // 5 는 5 보다 크거나 같다
        System.out.println(5 >= 7); // 5 는 7 보다 크거나 같다

        System.out.println(5 == 5);
        System.out.println(5 == 3);
      //  System.out.println(5 = 5); 이것은 잘 못 됨

        System.out.println(5 != 5); // 5 는 5 와 (!=)같지 않다  false
        System.out.println(5 != 3); // 5 는 3 와 (!=)같지 않다  true
    }
}
