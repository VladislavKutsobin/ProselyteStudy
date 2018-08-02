package net.proselyte.javacore.chapter10;
import java.lang.*;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("Тело метода procA");
            throw new RuntimeException("Демонстрация");
        } finally {
            System.out.println("Выполнится в любом случае");
        }
    }

    static void procB() {
        try {
            System.out.println("Тело метода procB");
            return;
        } finally {
            System.out.println("Выполнится в любом случае procB");
        }
    }

    static void procC() {
        try {
            System.out.println("В теле метода procC");
        } finally {
            System.out.println("Обязательно выполнится в procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено!");
        }

        procB();
        procC();
    }
}
