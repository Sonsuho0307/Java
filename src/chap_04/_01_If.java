package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; //오전 10시
        if (hour < 14) {  //한 개의 문장만 쓸 때는 {}생략가능 하지만 그 이상이면 {}로 덮기
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료#1");

        //오후 2시 이전, 모닝 커피를 마시지 않은 경우
        hour = 10;
        boolean mornigCoffee = false; //모닝 커피
       // if (hour < 14 && mornigCoffee == false)
        if (hour < 14 && !mornigCoffee) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("커피 주문 완료#2");
        }

        // 오후 2시 이후이거나 모닝 커피를 마신 경우
        hour = 15;
        mornigCoffee = true;
//        if (hour > 14 || mornigCoffee == true )
        if (hour > 14 || mornigCoffee) {
            System.out.println("아이스 아메리카노 (디카페인) +1");
            System.out.println("커피 주문 완료#3");;
        }
    }
}
