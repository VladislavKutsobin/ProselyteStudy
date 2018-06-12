package net.proselyte.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false; // boolean может быть true или false

        //можно использовать в условном операторе if
        if (b) System.out.println("Код не выполнится т.к b - false");
        b = true;
        if (b) System.out.println("Этот код выполнится");
    }
}
