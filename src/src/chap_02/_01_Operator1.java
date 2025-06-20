package chap_02;

import java.sql.SQLOutput;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2 결과는 정수만 나옴
        System.out.println(2 / 4); //0 0.5지만 정수만 나옴
        System.out.println(4 % 2); //4를 2로 나눈 나머지 값 = 0
        System.out.println(5 % 2); //몫2 나머지 1 그래서 값은 1로 나온다

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2); //8
        System.out.println(2 + (2 * 2)); //6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); //30
        System.out.println(c - a); //10

        c = a * b;
        System.out.println(c); //200

        c = a % b; // = 0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); //11

        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        val = 10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); //0
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++); //5
        System.out.println("총 대기 인원 : " + waiting); //5


        //선착순 표 마감
        int timeattack = 11;
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);
        System.out.println("남은 인원 : " + --timeattack);

        // 위 아래 같은 값이 나온다

         timeattack = 10;
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);
        System.out.println("남은 인원 : " + timeattack--);


     }
}
