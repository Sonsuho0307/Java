package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)

        // \n : 줄바꿈
        System.out.println("자바가\n너무\n재미없어요.");

        // \t : 탭
        System.out.println("김치찌개\t9000원");
        System.out.println("콩찌개\t9000원");
        System.out.println("전찌개\t9000원");

        // \\ : 역슬래시
        System.out.println("C:\\Program Fiels\\Java");

        // \" : 큰 따옴표
        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        // \' : 작은 따옴표
        //단비가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A'; // char 일때는 " 말고 '를 써야함
        c = '\'';
        System.out.println(c); // '



    }
}
