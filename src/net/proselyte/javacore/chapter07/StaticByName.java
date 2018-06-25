package net.proselyte.javacore.chapter07;

class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void CallMe() {
        System.out.println("a = " + a);
    }
}

public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.CallMe();
        System.out.println("b = " + StaticDemo.b);
    }
}
