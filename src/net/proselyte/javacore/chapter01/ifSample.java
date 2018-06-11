package net.proselyte.javacore.chapter01;

public class ifSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("Теперь x=y");
        x = x * 2;
        if (x > y) System.out.println("Теперь x > y");

        if(x == y) System.out.print("Эта команда не сработает так как x не равен y");
    }
}
