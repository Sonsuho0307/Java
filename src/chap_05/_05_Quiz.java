package chap05;

public class _05_Quiz {
    public static void main(String[] args) {

        // 신발 사이즈는 250 부터 295 까지 5 단위로 증가
        // 신발 사이즈 수는 총 10가지

        // 사이즈 250 (재고 있음)
        // 사이즈 255 (재고 있음)
        //...
        // 사이즈 295 (재고 있음)

        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);

        }
        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + "재고 있음");
        }
    }
}
