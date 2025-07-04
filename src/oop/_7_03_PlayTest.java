package oop;

abstract class Player { // 추상 메서드를 갖고 있기 때문에 추상 클래스가 된다.
    abstract void play(int pos); // 추상 메서드기 때문에 class에도 abstract를 붙여야함
    abstract void stop(); // 추상 메서드 구현부{} 가 없는 메소드
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlayer extends Player {
    void play(int pos) {
        System.out.println(pos + "위치부터 실행합니다.");
    }
    void stop() {
        System.out.println("재생을 멈춥니다.");
    }
}

public class _7_03_PlayTest {
    public static void main(String[] args) {
//        Player p = new Player(); 추상 클래스의 객체를 생성 - 불가
        Player ap = new AudioPlayer(); // 다형성
        ap.play(100);
        ap.stop();
    }
}
