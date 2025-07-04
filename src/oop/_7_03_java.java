package oop;

public class _7_03_java {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;  // car =(Car)fe; 에서 형변환이 생략됨  조상 <- 자식 생략 가능
//        car.water();
        fe2 = (FireEngine)car; // 자손타입 <- 조상타입. 형변환 생략 불가
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!");
    }
}
