package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 0;
        int max = 30000;
        int i = 1;
//        int sale = 2000; // 경차, 장애인 차량 50% 할인

        for (int won = 4000; won < 30000; ) {
            hour++;
            i++;
            System.out.println("현재 주차 하신지 " + hour +"시간 되었습니다. 주차금액은 " + won + "원 입니다");
            won = i * 4000;



            // 이 밑으로는 맞아
            if (won >= max){
                hour++;
                System.out.println("주차하신지 " + hour + "시간 되었습니다. 최대 요금을 넘었습니다.");

                break;
            }

        }
        int won = 30000;
        System.out.println("주차 요금을 정산합니다." + "금액 : " + won + "원");


        System.out.println("------답안지-------------");
        
        int hour1 = 5; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour1 * 4000; // 주차 정산 요금 시간당 4000 원 곱하기

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000;
        }
        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee = fee / 2; // fee/= 2;    50% 할인 적용
        }

        System.out.println(" 주차 요금은 " + fee + "원 입니다.");
    }


}
