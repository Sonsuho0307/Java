package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int min = 120;
        int kid1 = 115;
        int kid2 = 121;

        String a = (min >= kid1) ? "키가 115cm 이므로 탑승 불가능합니다" : "키가 115cm 이므로 탑승 가능합니다";
        System.out.println(a);

        String b = ((min >= kid2)) ? "키가 121cm 이므로 탑승 불가능합니다" : "키가 121cm 이므로 탑승 가능합니다";
        System.out.println(b);

        // 정답

        int height = 115;
        String result = (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 " + height + "cm 이므로 " + result + "입니다.");
    }
}
