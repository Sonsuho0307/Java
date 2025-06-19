package chap06;

public class _03_Retrun {
    // 호텔 전화번호
    // String 자리에 int boolean number double 등 사용 가능
    public static String getPhoneNumber() {
        String phoneNumber = "02 - 1234 - 5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 액티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호는 " + contactNumber + " 입니다.");

        String address = getAddress();
        System.out.println("호텔 주소는 " + address + " 입니다.");

        //String activities = getActivities();
        System.out.println("호텔 액티비티는 " + getActivities()); // 위에 글 생략가능
    }
}
