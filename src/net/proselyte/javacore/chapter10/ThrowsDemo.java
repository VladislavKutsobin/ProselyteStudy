package net.proselyte.javacore.chapter10;

import java.lang.*;

public class ThrowsDemo {
    static void throwsOne() throws IllegalAccessError {
        System.out.println("В теле метода throwsOne(): ");
        throw new IllegalAccessError("Демонастрация");
    }

    public static void main(String[] args) {
        try {
            throwsOne();
        } catch (IllegalAccessError e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
