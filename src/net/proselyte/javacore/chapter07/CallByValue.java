package net.proselyte.javacore.chapter07;

class TesT {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        int a = 10, b = 15;
        TesT ob = new TesT();

        System.out.println("Выводим а и b: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("Ничего не изменится: " + a + " " + b);
    }
}
