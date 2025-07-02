package oop;

class MyPoint {
    int x;
    int y;
}
//class Circle extends MyPoint { // 상속
//    int r;
//}

class Circle {       // 포함
    MyPoint p = new MyPoint();
    int r;
}
public class _7_01_inheritencTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
//        System.out.println("c.x="+c.x);
//        System.out.println("c.y="+c.y);   상속
//        System.out.println("c.r="+c.r);

        System.out.println("c.x = "+ c.p.x);
        System.out.println("c.y = "+ c.p.y); // 포함
        System.out.println("c.r = "+ c.r);

    }
}
