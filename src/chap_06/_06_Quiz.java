package chap06;

public class _06_Quiz {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0,index); // 손수호 -> 손
        // for (int i = index; i < data,lenght(); i++) 밑의 for 문과 같다
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;

    }
    public static void main(String[] args) {
        String name = "손수호";
        String id = "990307-1033333";
        String phone = "010-4197-2716";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));


    }
}
