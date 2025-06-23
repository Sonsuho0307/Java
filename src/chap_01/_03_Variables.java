package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        int hour = 15;
        name = "수호님";


        System.out.println(name + " 배송이 시작됩니다 " + hour + "시 방문 예정입니다.");
        System.out.println(name + " 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';

        System.out.println(name + "의 학점은 " + score + "점으로 " + grade + "입니다." );


        boolean pass = true;
        System.out.println("이번 시험은 1등 일까요? " + pass);

        double d = 3.14;
        float f = 3.14f;
        System.out.println(d);
        System.out.println(f);

        int i = 1000000000;

        long l = 10_000_000_000_000L;
        System.out.println(l);

//          int.  long.  double, float,  char,    String,    boolean
//       정수(~21억)  더큰정수  실수   더큰실수 한개문자  여러가지문자   참.거짓
    }
}
