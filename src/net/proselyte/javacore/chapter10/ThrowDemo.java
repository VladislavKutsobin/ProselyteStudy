package net.proselyte.javacore.chapter10;

import java.lang.*;

public class ThrowDemo {
    static void demopoc() {
        try {
            throw new NullPointerException("Демонастрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demopoc(): ");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demopoc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват исключения: " + e);
        }
    }
}
