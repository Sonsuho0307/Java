package oop.pkg1;

public class MyParent {
    private   int prv;  // 같은 클래스
              int dft;  // 같은 패키지 (defult)
    protected int prt;  // 같은 패키지 + 자손(다른 패키지)
    public    int pub;  // 접근 제한 없음.

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}
 class MyParentTest {
    public static void main(String[] args) {
        MyParent a = new MyParent();
//        System.out.println(a.prv);    // 에러. 같은 클래스에서만 사용 가능하기 때문
        System.out.println(a.dft);
        System.out.println(a.prt);
        System.out.println(a.pub);

    }
}
