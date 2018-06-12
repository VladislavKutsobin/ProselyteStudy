package net.proselyte.javacore.chapter01;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("x равен: " + x);
            System.out.println("y равен: " + y);
            y = y - 2; //{}- блоки кода
        }
    }
}
