package net.proselyte.javacore.chapter08;

class A {
    int i;
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i в суперклассе " + super.i);
        System.out.println("i в классе B " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B obj = new B(1, 2);
        obj.show();
    }
}
