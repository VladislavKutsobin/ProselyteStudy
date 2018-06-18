package net.proselyte.javacore.chapter05;

public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("Такт " + n);
        } while (--n > 0);
    }
}
