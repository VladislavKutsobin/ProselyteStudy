package net.proselyte.javacore.chapter08;

class C {
    int i, j;
    C(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Вывести i и j: " + i + " " + j);
    }
}

class D extends C {
    int k;
    D(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("Выведем k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        D obj = new D(1, 2, 3);
        obj.show();
    }
}
