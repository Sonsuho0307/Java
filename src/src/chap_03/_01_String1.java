package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이 = .length()
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로
        System.out.println(s.toLowerCase()); // 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함 된다면 true // 포함되지 않는다면 false
        System.out.println(s.contains("c#")); // false
        System.out.println(s.indexOf("Java")); // 위치 정보
        // 0부터 시작이라 0 1 2 3 4 5 6 7(J)

        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 결과는 -1

        System.out.println(s.indexOf("and")); // 처음 일치하는 위치정보 12
        System.out.println(s.lastIndexOf("and")); // 마지막으로 일치하는 위치정보 23
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith(".")); // 이 문자열로 시작하면 true
    }
}
