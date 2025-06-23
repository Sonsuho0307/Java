package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String suho = "990307-1032318";
        System.out.println(suho.substring(suho.indexOf("99"), suho.lastIndexOf("0")));
        System.out.println(suho.substring(suho.indexOf("99"), suho.indexOf("032")));
        System.out.println(suho.substring(0, 8)); // 0 위치부터 8 위치 직전까지
        System.out.println(suho.substring(0, suho.indexOf("-") + 2)); // 0 위치부터 "-" 위치
                                                                                    // + 2직전까지


    }
}
