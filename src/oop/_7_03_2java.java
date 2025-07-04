package oop;

public class _7_03_2java {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank() };

        for (int i = 0; i < group.length; i++)
            group[i].move(100, 200);
    }

}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + " y=" + y + "]");
    }
    void stimPack() {}
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + " y=" + y + "]");
    }
    void  changeMode () {}
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + "y=" + y + "]");
    }
}