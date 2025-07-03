package oop.pkg2;


import oop.pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers() {
//        System.out.println(prv); // 에러. 같은 클래스에서만
//        System.out.println(dft); // 에러. 같은 패키지에서만
        System.out.println(prt);
        System.out.println(pub);
    }

}
public class MyParentTest2 {
    public static void main(String[] args) {
        MyParent a = new MyParent();
//        System.out.println(a.prv);    // 에러. 같은 클래스에서만 사용 가능하기 때문
//        System.out.println(a.dft);      // 에러. 같은 패키지에서만 사용 가능하기 때문
//        System.out.println(a.prt);      // 에러. 같은 패키지 + 자손(다른패키지)에서만
        System.out.println(a.pub);

    }
}
